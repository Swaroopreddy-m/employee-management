package com.third.springboot.employee.dynamicbuilder;

import java.util.ArrayList;
import java.util.List;

public class FieldParser {

    // Expected format:
    // FFN001:I:D:B:10%
    private static final int EXPECTED_PARTS = 5;

    private FieldParser() {
        // utility class – prevent object creation
    }

    public static List<FieldConfig> parseFields(String line) {

        List<FieldConfig> fieldsList = new ArrayList<>();

        // 1️⃣ Safety check
        if (line == null || line.trim().isEmpty()) {
            return fieldsList;
        }

        // 2️⃣ Split multiple fields
        String[] fields = line.split(",");

        for (String field : fields) {

            if (field == null || field.trim().isEmpty()) {
                continue;
            }

            // 3️⃣ Split field parts
            String[] parts = field.trim().split(":");

            // 4️⃣ Validate format
            if (parts.length != EXPECTED_PARTS) {
                // skip malformed config
                continue;
            }

            // 5️⃣ Build FieldConfig
            FieldConfig config = new FieldConfig();
            config.setName(parts[0].trim());
            config.setType(parts[1].trim().charAt(0));
            config.setVisibility(parts[2].trim().charAt(0));
            config.setColor(parts[3].trim().charAt(0));
            config.setWidth(parts[4].trim());

            fieldsList.add(config);
        }

        return fieldsList;
    }
}