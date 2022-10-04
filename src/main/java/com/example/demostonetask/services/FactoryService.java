package com.example.demostonetask.services;

import com.example.demostonetask.models.entities.Stone;
import com.example.demostonetask.models.entities.enums.StoneType;

import java.util.ArrayList;
import java.util.List;

public interface FactoryService {
    ArrayList<Stone> getNecklace();

    double getCaratWeight(List<Stone> stones);

    int getCost(List<Stone> stones);
}
