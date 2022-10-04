package com.example.demostonetask.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class PreciousStone extends Stone{
    public PreciousStone() {
        super();
    }

    public PreciousStone(String name, double price, double weight, String color,int transparent) {
        super(name, price, weight, color,transparent);
    }


}
