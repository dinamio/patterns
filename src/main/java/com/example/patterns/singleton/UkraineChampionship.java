package com.example.patterns.singleton;

/**
 * Created by eugen on 3/21/17.
 */
public class UkraineChampionship {

    private String name;

    private static UkraineChampionship instance;

    private UkraineChampionship() {

    }

    public static  UkraineChampionship getInstance() {
        if (instance == null) {
            synchronized (UkraineChampionship.class) {
                if (instance == null) {
                    instance = new UkraineChampionship();
                    System.out.println("Created new instance");
                }
            }
        }
        return instance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
