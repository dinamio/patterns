package com.example.patterns.decorator;

import org.springframework.context.annotation.Bean;

/**
 * Created by eugen on 3/19/17.
 */
public class DecoratorConfig {

    @Bean
    public Instrument instrument() {
        Guitar guitar = new Guitar();
        return new RedDecorator(guitar);
    }
}
