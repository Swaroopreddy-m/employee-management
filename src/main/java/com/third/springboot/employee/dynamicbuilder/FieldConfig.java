package com.third.springboot.employee.dynamicbuilder;

public class FieldConfig {

    private String name;
    private String type;        // I (Input), L (Label), etc.
    private String visibility;  // D (Display) / H (Hidden)
    private String color;       // B (Black) / W (White) / R (Red)
    private String width;     // 10%, 100px, auto

    // 🔹 Getters

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getColor() {
        return color;
    }

    public String getWidth() {
        return width;
    }

    // 🔹 Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    // 🔹 Optional: for debugging/logging
    @Override
    public String toString() {
        return "FieldConfig{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", visibility='" + visibility + '\'' +
                ", color='" + color + '\'' +
                ", width='" + width + '\'' +
                '}';
    }
}