package com.third.springboot.employee.dynamicbuilder;

public class FieldConfig {

    private String name;
    private char type;        // I (Input), L (Label), etc.
    private char visibility;  // D (Display) / H (Hidden)
    private char color;       // B (Black) / W (White) / R (Red)
    private String width;     // 10%, 100px, auto

    // 🔹 Getters

    public String getName() {
        return name;
    }

    public char getType() {
        return type;
    }

    public char getVisibility() {
        return visibility;
    }

    public char getColor() {
        return color;
    }

    public String getWidth() {
        return width;
    }

    // 🔹 Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setVisibility(char visibility) {
        this.visibility = visibility;
    }

    public void setColor(char color) {
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
                ", type=" + type +
                ", visibility=" + visibility +
                ", color=" + color +
                ", width='" + width + '\'' +
                '}';
    }
}