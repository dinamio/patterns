package com.example.patterns.singleton;

/**
 * Created by eugen on 3/21/17.
 */
public class FootballThread extends Thread {
    @Override
    public void run() {
        UkraineChampionship ukraineChampionship = UkraineChampionship.getInstance();
    }
}
