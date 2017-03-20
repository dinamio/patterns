package com.example.patterns.strategy;

import com.example.patterns.Pattern;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by eugen on 3/20/17.
 */
public class StrategyPattern implements Pattern {
    @Override
    public void run() {
        ApplicationContext context = new AnnotationConfigApplicationContext(StrategyConfig.class);
        MyList list = context.getBean(MyList.class);
        System.out.println(list);
        list.performSort();
        System.out.println(list);
    }
}
