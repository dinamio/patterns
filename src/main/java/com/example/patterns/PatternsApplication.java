package com.example.patterns;

import com.example.patterns.strategy.MyList;
import com.example.patterns.strategy.StrategyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PatternsApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StrategyConfig.class);
		MyList list = context.getBean(MyList.class);
		System.out.println(list);
		list.performSort();
		System.out.println(list);
	}
}
