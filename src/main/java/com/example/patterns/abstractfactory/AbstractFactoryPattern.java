package com.example.patterns.abstractfactory;

import com.example.patterns.Pattern;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by eugen on 3/20/17.
 */
public class AbstractFactoryPattern implements Pattern {
    @Override
    public void run() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AbstractFactoryConfig.class);
        OsetinPieFactory factory = context.getBean(OsetinPieFactory.class);
        OsetinPie pie = factory.createPie();
        pie.getInsides();
    }
}
