package com.example.demostonetask.controllers;

import com.example.demostonetask.exceptions.NecklaceAbsentException;
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
                    + "8-Стоп");
            switch (sc.nextInt()) {
                case 1:
                    necklace = new Necklace();
                    necklace.product();
                    break;
                case 2:
                    try {
                        necklace.getCaratInfo();
                    } catch (NecklaceAbsentException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Исключение было обработано. Программа продолжается");
                    }
                    break;
                case 3:
                    try {
                        necklace.getPriceInfo();
                    } catch (NecklaceAbsentException e){
                        System.out.println(e.getMessage());
                        System.out.println("Исключение было обработано. Программа продолжается");
                    }
                    break;
                case 4:
                    try {
                        necklace.getSortedPriceInfo();
                    }catch (NecklaceAbsentException e){
                        System.out.println(e.getMessage());
                        System.out.println("Исключение было обработано. Программа продолжается");
                    }
                    break;
                case 5:
                    try {
                        necklace.getSortedWeightInfo();
                    }catch (NecklaceAbsentException e){
                        System.out.println(e.getMessage());
                        System.out.println("Исключение было обработано. Программа продолжается");
                    }
                    break;
                case 6:
                    try{
                        System.out.println("Введите цвет: (пример:red)");
                    necklace.getStoneByColor(sc.next());
                    }catch (NecklaceAbsentException e){
                        System.out.println(e.getMessage());
                        System.out.println("Исключение было обработано. Программа продолжается");
                    }
                    break;
                case 7:
                   try{
                        necklace.getSortedTransparencyInfo();
                   }catch (NecklaceAbsentException e){
                       System.out.println(e.getMessage());
                       System.out.println("Исключение было обработано. Программа продолжается");
                   }
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
