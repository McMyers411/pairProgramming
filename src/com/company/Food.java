package com.company;

/**
 * Created by am411 on 10/19/16.
 */
public class Food {
    public Food (double p){
       price = p;

    }
    public void nextFood1 (double a){
        apple += a;
    }
    public void nextFood2 (double pr){
        pear += pr;
    }
    public void nextFood (double g){
        grape += g;
    }
    public double callID (double c){
        price = grape + apple + pear;
        return price;

    }

    public double price;
    public double apple;
    public double pear;
    public double grape;
}