package com.example.demostonetask.controllers;

import com.example.demostonetask.models.entities.Stone;
import com.example.demostonetask.services.DisplayService;

import java.util.ArrayList;

public class Display implements DisplayService {

    @Override
    public void representInfo(ArrayList<Stone> stones) {
        System.out.println("Necklace:");
        for (Stone stone : stones) {
            if (stone.getPleochroism() != null) {
                System.out.println("Stone: " + stone.getName() +
                        " Color: " + stone.getColor() +
                        " Weight: " + stone.getWeight() +
                        " Price: " + stone.getPrice() +
                        " Transparency: " + stone.getTransparent() +
                        " Pleochroism: " + stone.getPleochroism());
            }else {
                System.out.println("Stone: " + stone.getName() +
                        " Color: " + stone.getColor() +
                        " Weight: " + stone.getWeight() +
                        " Price: " + stone.getPrice() +
                        " Transparency: " + stone.getTransparent());
            }
        }
        displayUnderline();
    }

    @Override
    public void displayCaratInfo(double caratWeight) {
        System.out.println("Total carat weight: "+caratWeight);
        displayUnderline();
    }

    @Override
    public void displayPriceInfo(int cost) {
        System.out.println("Total stones cost: " +cost);
        displayUnderline();
    }

    @Override
    public void displayUnderline() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }

    @Override
    public void displaySortedPrice(ArrayList<Stone> stones) {
        System.out.println("Stones sorted by price: ");
        representInfo(stones);
    }

    @Override
    public void displaySortedWeight(ArrayList<Stone> stones) {
        System.out.println("Stones sorted by weight: ");
        representInfo(stones);
    }

    @Override
    public void displaySortedTransparency(ArrayList<Stone> stones) {
        System.out.println("Stones sorted by Transparency: ");
        representInfo(stones);
    }

    @Override
    public void displayStoneByColor(ArrayList<Stone> stoneByColor) {
        System.out.println("Stones matching in color: ");
        representInfo(stoneByColor);
    }
}
