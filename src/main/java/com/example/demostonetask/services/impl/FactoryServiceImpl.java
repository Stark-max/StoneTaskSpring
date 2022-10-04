package com.example.demostonetask.services.impl;

import com.example.demostonetask.models.entities.PreciousStone;
import com.example.demostonetask.models.entities.SemiPreciousStone;
import com.example.demostonetask.models.entities.Stone;
import com.example.demostonetask.models.entities.enums.StoneType;
import com.example.demostonetask.services.FactoryService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FactoryServiceImpl {
    /*@Override
    public ArrayList<Stone> getNecklace() {
        Random random = new Random();
        ArrayList<Stone> n =new ArrayList<>();
        ArrayList<StoneType> necklace = new ArrayList<>();
        for (int i = 0; i < random.nextInt(10) + 2; i++) {
            int pick = new Random().nextInt(StoneType.values().length);
            if(StoneType.values()[pick].getPleochroism()!=null){
                SemiPreciousStone stone = new SemiPreciousStone();
                stone.setName(StoneType.values()[pick].name());
                stone.setWeight(StoneType.values()[pick].getWeight());
                stone.setPrice(StoneType.values()[pick].getPrice());
                stone.setColor(StoneType.values()[pick].getColor());
                stone.setPleochroism(StoneType.values()[pick].getPleochroism());
                stone.setTransparent(StoneType.values()[pick].getTransparency());
                n.add(stone);
            }
            else{
                PreciousStone stone = new PreciousStone();
                stone.setName(StoneType.values()[pick].name());
                stone.setWeight(StoneType.values()[pick].getWeight());
                stone.setPrice(StoneType.values()[pick].getPrice());
                stone.setColor(StoneType.values()[pick].getColor());
                stone.setTransparent(StoneType.values()[pick].getTransparency());
                n.add(stone);
            }
        }
        return n;
    }

    @Override
    public double getCaratWeight(List<Stone> stones) {
        double carat = 0.0;
        for (Stone s : stones) {
            carat += s.getWeight();
        }
        return carat;
    }

    @Override
    public int getCost(List<Stone> stones) {
        int cost = 0;
        for (Stone s : stones) {
            cost += s.getPrice() * s.getWeight();
        }
        return cost;

    }*/
}
