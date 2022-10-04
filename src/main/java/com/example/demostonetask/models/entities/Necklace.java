package com.example.demostonetask.models.entities;

import com.example.demostonetask.controllers.Display;
import com.example.demostonetask.controllers.Factory;
import com.example.demostonetask.controllers.Machine;
import com.example.demostonetask.services.DisplayService;
import com.example.demostonetask.services.FactoryService;
import com.example.demostonetask.services.MachineService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Necklace {
    private ArrayList<Stone> stones = new ArrayList<>();
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

    public void getCaratInfo(){
        display.displayCaratInfo(factory.getCaratWeight(stones));
    }

    public void getPriceInfo(){
        display.displayPriceInfo(factory.getCost(stones));
    }

    public void getSortedPriceInfo(){
        machine.sortByPrice(stones);
        display.displaySortedPrice(stones);
    }

    public void getSortedWeightInfo(){
        machine.sortByWeight(stones);
        display.displaySortedWeight(stones);
    }

    public void getSortedTransparencyInfo(){
        machine.sortByTransparency(stones);
        display.displaySortedTransparency(stones);
    }

    public void getStoneByColor(String color){
        display.displayStoneByColor(machine.findStoneByColor(color,stones));
    }
    public void getAllInfo(){
        display.representInfo(stones);
    }
}
