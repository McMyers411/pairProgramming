package com.company;

public class Main {

    public static void main(String[] args) {
        Food cost = new Food(2.50);

        cost.nextFood(2.80);

        cost.nextFood2(2.00);

        cost.nextFood1(1.80);

        double addPrices = cost.callID();

        System.out.println(addPrices);

    }
}
