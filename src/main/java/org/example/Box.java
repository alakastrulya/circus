package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Box {
    private int width;
    private int height;
    private String color;
    @Autowired
    private CellophaneBag celophaneBag;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public CellophaneBag getCelophaneBag() {
        return celophaneBag;
    }

    public void setCelophaneBag(CellophaneBag celophaneBag) {
        this.celophaneBag = celophaneBag;
    }
}
