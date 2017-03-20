package com.example.patterns.strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.Random;

/**
 * Created by eugen on 3/17/17.
 */
@Configuration
@ComponentScan(basePackages = "strategy")
public class StrategyConfig {

    private static Integer LIST_SIZE=10;

    @Bean
    public MyList list() {
        return new MyList(generateRandomArray(LIST_SIZE),LIST_SIZE,new QuickSorting());
    }

    private Integer[] generateRandomArray(Integer listSize) {
        Integer []arr = new Integer[listSize];
        Random random = new Random();
        for(int i=0;i<listSize;i++) {
            arr[i]=random.nextInt(100);
        }
        return arr;
    }
}
