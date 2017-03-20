package com.example.patterns.observer;

import com.example.patterns.Pattern;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by eugen on 3/20/17.
 */
public class ObserverPattern implements Pattern {
    @Override
    public void run() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ObserverConfig.class);
        Game championsLeague = context.getBean(Game.class);
        Bid bid = context.getBean(Bid.class);
        championsLeague.addObserver(bid);
        championsLeague.scoreFirst();
        System.out.println(bid);
        championsLeague.scoreSecond();
        System.out.println(bid);
    }
}
