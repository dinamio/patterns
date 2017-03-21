package com.example.patterns.singleton;

import com.example.patterns.Pattern;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by eugen on 3/21/17.
 */
public class SingletonPattern implements Pattern {
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            (new FootballThread()).start();
        }
        UkraineChampionship ukraineChampionship = UkraineChampionship.getInstance();
        ukraineChampionship.setName("Ukraine Premier League");
        UkraineChampionship nextUkraineChampionship = UkraineChampionship.getInstance();
        System.out.println(nextUkraineChampionship.getName());

    }
}
