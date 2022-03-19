package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(dod(10 + (int) +(Math.random() + 10), 10));
        System.out.println(dod(10 + (int) +(Math.random() + 10), 11));
        System.out.println(dod(10 + (int) +(Math.random() + 10), 12));
        System.out.println(dod(10 + (int) +(Math.random() + 10), 13));
        System.out.println(dod(10 + (int) +(Math.random() + 10), 14));

    }


    public static String dod(int ageOfMan, int temp) {

        Random random = new Random();
        int a = 10;
        int b = 15;
        int generateRandomAge = a + (int) +(Math.random() + b);

        String toy1 = "Можно идти гулять ";

        String toy2 = "Оставайтесь дома ";
        if (ageOfMan >= 10 + (int) +(Math.random() + 10) && ageOfMan <= 10 + (int) +(Math.random() + 10) && temp >= -20 && temp <= 30) {
            return toy1;
        } else if (ageOfMan < 10 + (int) +(Math.random() + 10) && temp >= 0 && temp <= 28) {
            return toy1;
        } else {
            return toy2;

        }


    }

}







