package com.example.patterns.decorator;

import com.example.patterns.Pattern;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by eugen on 3/20/17.
 */
public class DecoratorPattern implements Pattern {
    @Override
    public void run() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DecoratorConfig.class);
        Instrument instrument = context.getBean(Instrument.class);
        instrument.play();
    }
}
