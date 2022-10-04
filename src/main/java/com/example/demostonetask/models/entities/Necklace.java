package com.example.demostonetask.models.entities;

import com.example.demostonetask.controllers.Display;
import com.example.demostonetask.controllers.Factory;
import com.example.demostonetask.controllers.Machine;
import com.example.demostonetask.exceptions.NecklaceAbsentException;
import com.example.demostonetask.services.DisplayService;
import com.example.demostonetask.services.FactoryService;
import com.example.demostonetask.services.MachineService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Necklace {
    private ArrayList<Stone> stones;
    @Autowired
    private FactoryService factory;
    @Autowired
    private DisplayService display;
    @Autowired
    private MachineService machine;

    public void product() {
        stones.addAll(factory.getNecklace());
        display.representInfo(stones);
    }

    public void getCaratInfo() {
        if (stones == null) {
            throw new NecklaceAbsentException("Данные отсутствуют");
        } else
            display.displayCaratInfo(factory.getCaratWeight(stones));
    }

    public void getPriceInfo() {
        if (stones == null) {
            throw new NecklaceAbsentException("Данные отсутствуют");
        } else
            display.displayPriceInfo(factory.getCost(stones));
    }

    public void getSortedPriceInfo() {
        if (stones == null) {
            throw new NecklaceAbsentException("Данные отсутствуют");
        } else
            machine.sortByPrice(stones);
        display.displaySortedPrice(stones);
    }

    public void getSortedWeightInfo() {
        if (stones == null) {
            throw new NecklaceAbsentException("Данные отсутствуют");
        } else
            machine.sortByWeight(stones);
        display.displaySortedWeight(stones);
    }

    public void getSortedTransparencyInfo() {
        if (stones == null) {
            throw new NecklaceAbsentException("Данные отсутствуют");
        } else
            machine.sortByTransparency(stones);
        display.displaySortedTransparency(stones);
    }

    public void getStoneByColor(String color) {
        if (stones == null) {
            throw new NecklaceAbsentException("Данные отсутствуют");
        } else
            display.displayStoneByColor(machine.findStoneByColor(color, stones));
    }

   /* public void getAllInfo() {
        display.representInfo(stones);
    }*/
}
