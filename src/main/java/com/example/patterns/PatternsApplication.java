package com.example.patterns;

import com.example.patterns.abstractfactory.AbstractFactoryConfig;
import com.example.patterns.abstractfactory.OsetinPie;
import com.example.patterns.abstractfactory.OsetinPieFactory;
import com.example.patterns.decorator.DecoratorConfig;
import com.example.patterns.decorator.Instrument;
import com.example.patterns.fabricmethod.ChampionshipLeague;
import com.example.patterns.fabricmethod.FabricMethodConfig;
import com.example.patterns.fabricmethod.FirstLeague;
import com.example.patterns.fabricmethod.SecondLeague;
import com.example.patterns.observer.Bid;
import com.example.patterns.observer.Game;
import com.example.patterns.observer.ObserverConfig;
import com.example.patterns.strategy.MyList;
import com.example.patterns.strategy.StrategyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PatternsApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PatternConfig.class);
		Pattern pattern = context.getBean(Pattern.class);
		pattern.run();
	}


}
