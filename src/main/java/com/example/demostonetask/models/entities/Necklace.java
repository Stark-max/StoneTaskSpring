package com.example.demostonetask.models.entities;

import com.example.demostonetask.controllers.Display;
import com.example.demostonetask.controllers.Factory;
import com.example.demostonetask.controllers.Machine;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Necklace {
    private ArrayList<Stone> stones = new ArrayList<>();
    private Factory factory = new Factory();
    private Display display = new Display();
    private Machine machine = new Machine();

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
   /* public void getAllInfo(){
        display.representInfo(stones);
    }*/
}
