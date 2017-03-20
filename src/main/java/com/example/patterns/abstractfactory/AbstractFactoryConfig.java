package com.example.patterns.abstractfactory;

import org.springframework.context.annotation.Bean;

/**
 * Created by eugen on 3/20/17.
 */
public class AbstractFactoryConfig {

    @Bean
    public OsetinPieFactory factory() {
        //return new MeatOsetinPieFactory();
        return new CabbageOsetinPieFactory();
    }
}
