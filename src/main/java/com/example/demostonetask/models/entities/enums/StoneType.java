package com.example.demostonetask.models.entities.enums;

public enum StoneType {
    DIAMOND(311.86,3.830,"RED",1),
    EMERALD(768.92,    2.050,  "GREEN",1),
    RUBY(418.14,   3.506,    "GREEN",1),
    SAPPHIRE(775.67,5.492,"RED",1),
    PEARLS(794.20,4.138,"RED",4),
    TURQUOISE(655.38,3.265,"Black","Opalescence",4),
    GARNET(140.33,8.018,"RED","Opalescence",2),
    OPAL(570.56,1.138,"WHITE","Tiger_Eye",3),
    AGATE(333.16,2.614,"YELLOW","Tigers_Eye",3),
    AMBER(667.18,6.851,"BLUE","Asterism",2);

    double price;
    double weight;
    String color;
    String pleochroism;
    int transparency;

    StoneType() {
    }

    StoneType(double price, double weight, String color, int transparency) {
        this.price=price;
        this.weight=weight;
        this.color=color;
        this.transparency=transparency;
    }

    StoneType(double price, double weight, String color, String pleochroism, int transparency) {
        this.price=price;
        this.weight=weight;
        this.color=color;
        this.pleochroism=pleochroism;
        this.transparency=transparency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPleochroism() {
        return pleochroism;
    }

    public void setPleochroism(String pleochroism) {
        this.pleochroism = pleochroism;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }
}
