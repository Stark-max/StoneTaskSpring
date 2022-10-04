package com.example.demostonetask.controllers;

import com.example.demostonetask.models.entities.Necklace;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Menu {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        Necklace necklace = new Necklace();
        while (true) {
            System.out.println(" 1-Создать ожерелье \n "
                    + "2-Рассчитать общий вес \n "
                    + "3-Рассчитать общую стоимость камней \n "
                    + "4-Сортировать камни по цене \n "
                    + "5-Сортировать камни по весу\n "
                    + "6-найти камень по цвету\n "
                    + "7-Сортировать камни про прозрачности\n "
            +"8-Стоп");
            switch (sc.nextInt()) {
                case 1:
                    necklace = new Necklace();
                    necklace.product();
                    break;
                case 2:
                    necklace.getCaratInfo();
                    break;
                case 3:
                    necklace.getPriceInfo();
                    break;
                case 4:
                    necklace.getSortedPriceInfo();
                    break;
                case 5:
                    necklace.getSortedWeightInfo();
                    break;
                case 6:
                    System.out.println("Введите цвет: (пример:red)");
                    necklace.getStoneByColor(sc.next());
                    break;
                case 7:
                    necklace.getSortedTransparencyInfo();
                    break;
                case 8:
                    System.exit(0);
            }
        }
        /*necklace.product();
        necklace.getSortedPriceInfo();
        necklace.getCaratInfo();
        necklace.getPriceInfo();
        necklace.getStoneByColor("red");
        necklace.getSortedTransparencyInfo();
        necklace.getSortedWeightInfo();*/
    }
}
