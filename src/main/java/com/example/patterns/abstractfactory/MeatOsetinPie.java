package com.example.patterns.abstractfactory;

/**
 * Created by eugen on 3/20/17.
 */
public class MeatOsetinPie implements OsetinPie {
    @Override
    public void getInsides() {
        System.out.println("Cheese and meat pie");
    }
}
