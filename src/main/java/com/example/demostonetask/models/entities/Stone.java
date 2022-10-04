package com.example.demostonetask.models.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Stone {
    String name;
    double price;
    double weight;
    String color;
    int transparent;
    String pleochroism = null;

    public Stone() {
    }

    public Stone(String name, double price, double weight, String color, int transparent) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.transparent = transparent;
    }

    public Stone(String name, double price, double weight, String color, int transparent, String pleochroism) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.transparent = transparent;
        this.pleochroism = pleochroism;
    }
}
