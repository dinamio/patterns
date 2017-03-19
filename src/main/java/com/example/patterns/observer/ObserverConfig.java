package com.example.patterns.observer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by eugen on 3/19/17.
 */
@Configuration
public class ObserverConfig {

    @Bean
    public Game game() {
        Game game = new Game("Real","Barcelona",0,0);
        return game;
    }

    @Bean
    public Bid bid() {
        return new Bid(game(),2.5,1.1,2.6);
    }
}
