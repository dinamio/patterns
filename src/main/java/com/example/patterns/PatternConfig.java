package com.example.patterns;

import com.example.patterns.abstractfactory.AbstractFactoryPattern;
import com.example.patterns.singleton.SingletonPattern;
import com.example.patterns.strategy.StrategyPattern;
import org.springframework.context.annotation.Bean;

/**
 * Created by eugen on 3/20/17.
 */
public class PatternConfig {

    @Bean
    public Pattern pattern() {
        return new SingletonPattern();
    }
}
