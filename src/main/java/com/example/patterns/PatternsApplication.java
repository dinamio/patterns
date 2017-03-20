package com.example.patterns;

import com.example.patterns.decorator.DecoratorConfig;
import com.example.patterns.decorator.Instrument;
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
		getStrategyLogic();
		//getObserverLogic();
		//getDecoratorLogic();
	}

	private static void getDecoratorLogic() {
		ApplicationContext context = new AnnotationConfigApplicationContext(DecoratorConfig.class);
		Instrument instrument = context.getBean(Instrument.class);
		instrument.play();
	}

	private static void getObserverLogic() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ObserverConfig.class);
		Game championsLeague = context.getBean(Game.class);
		Bid bid = context.getBean(Bid.class);
		championsLeague.addObserver(bid);
		championsLeague.scoreFirst();
		System.out.println(bid);
		championsLeague.scoreSecond();
		System.out.println(bid);
	}

	private static void getStrategyLogic() {
		ApplicationContext context = new AnnotationConfigApplicationContext(StrategyConfig.class);
		MyList list = context.getBean(MyList.class);
		System.out.println(list);
		list.performSort();
		System.out.println(list);
	}
}
