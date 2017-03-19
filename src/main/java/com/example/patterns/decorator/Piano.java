package com.example.patterns.decorator;

/**
 * Created by eugen on 3/19/17.
 */
public class Piano implements Instrument {


    @Override
    public void play() {
        System.out.println("Play on piano");
    }
}
