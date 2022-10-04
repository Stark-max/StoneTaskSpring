package com.example.demostonetask.services;

import com.example.demostonetask.models.entities.Stone;

import java.util.ArrayList;

public interface DisplayService {
    void representInfo(ArrayList<Stone> stones);

    void displayCaratInfo(double caratWeight);

    void displayPriceInfo(int cost);
    void displayUnderline();

    void displaySortedPrice(ArrayList<Stone> stones);

    void displaySortedWeight(ArrayList<Stone> stones);

    void displaySortedTransparency(ArrayList<Stone> stones);

    void displayStoneByColor(ArrayList<Stone> stoneByColor);
}
