package com.third.springboot.employee.dynamicbuilder.service;

import com.third.springboot.employee.dynamicbuilder.FieldConfig;
import com.third.springboot.employee.dynamicbuilder.config.PageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class PageService {

    @Autowired
    private PageProperties pageProperties;

    public PageData getPageFields(String pageCode) {

        if (pageCode == null || pageCode.isBlank()) {
            return new PageData("", Collections.emptyList());
        }

        // 🔹 Get page config from properties
        Map<String, String> pages = pageProperties.getPages();
        String config = pages.get(pageCode.toUpperCase()); // ensure uppercase

        if (config == null || config.isBlank()) {
            System.out.println("❌ No config found for pageCode: " + pageCode);
            return new PageData("", Collections.emptyList());
        }

        // 🔹 Extract page type (CAP / CON / ACK)
        String[] fields = config.split(",");
        if (fields.length == 0) return new PageData("", Collections.emptyList());

        String firstField = fields[0];
        String[] firstParts = firstField.split("-", 2);
        String pageType = firstParts[0]; // CAP / CON / ACK
        fields[0] = firstParts[1]; // remove prefix from first field

        // 🔹 Parse fields
        List<FieldConfig> fieldConfigs = new ArrayList<>();
        for (String f : fields) {
            String[] parts = f.split(":");
            if (parts.length < 5) continue;

            FieldConfig field = new FieldConfig();
            field.setName(parts[0]);
            field.setType(parts[1].charAt(0));
            field.setVisibility(parts[2].charAt(0));
            field.setColor(parts[3].charAt(0));
            field.setWidth(parts[4]);
            fieldConfigs.add(field);
        }

        return new PageData(pageType, fieldConfigs);
    }

    public static class PageData {
        private String pageType;
        private List<FieldConfig> fields;

        public PageData(String pageType, List<FieldConfig> fields) {
            this.pageType = pageType;
            this.fields = fields;
        }

        public String getPageType() {
            return pageType;
        }

        public List<FieldConfig> getFields() {
            return fields;
        }
    }
}