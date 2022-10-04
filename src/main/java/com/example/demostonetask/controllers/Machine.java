package com.example.demostonetask.controllers;

import com.example.demostonetask.models.entities.Stone;
import com.example.demostonetask.services.MachineService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Machine implements MachineService {
    @Override
    public void sortByPrice(ArrayList<Stone> stones) {
        Collections.sort(stones,(p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    }

    @Override
    public void sortByWeight(ArrayList<Stone> stones) {
        Collections.sort(stones,(w1,w2) -> Double.compare(w1.getWeight(),w2.getWeight()));
    }

    @Override
    public void sortByTransparency(ArrayList<Stone> stones) {
        Collections.sort(stones,(t1,t2) -> Integer.compare(t1.getTransparent(),t2.getTransparent()));
    }

    @Override
    public ArrayList<Stone> findStoneByColor(String color, ArrayList<Stone> stones) {
        ArrayList<Stone> found = new ArrayList<>();
        for (Stone s:stones){
            if (s.getColor().equalsIgnoreCase(color)){
                found.add(s);
            }
        }
        return found;
    }
}
