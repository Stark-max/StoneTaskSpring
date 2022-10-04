package com.example.demostonetask.services;

import com.example.demostonetask.models.entities.Stone;

import java.util.ArrayList;

public interface MachineService {
    void sortByPrice(ArrayList<Stone> stones);

    void sortByWeight(ArrayList<Stone> stones);

    void sortByTransparency(ArrayList<Stone> stones);

    ArrayList<Stone> findStoneByColor(String color, ArrayList<Stone> stones);
}
