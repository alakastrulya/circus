package org.example;


import org.springframework.stereotype.Component;

@Component
public class Socks {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
