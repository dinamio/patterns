package com.example.patterns.decorator;

/**
 * Created by eugen on 3/19/17.
 */
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("playing on guitar");
    }
}
