package com.example.patterns.fabricmethod;

import com.example.patterns.Pattern;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by eugen on 3/20/17.
 */
public class FabricMethodPattern implements Pattern {
    @Override
    public void run() {
        ApplicationContext context = new AnnotationConfigApplicationContext(FabricMethodConfig.class);
        ChampionshipLeague firstLeague = (ChampionshipLeague) context.getBean("firstLeague");
        firstLeague.playGame();
        ChampionshipLeague secondLeague = (ChampionshipLeague) context.getBean("secondLeague");
        secondLeague.playGame();
    }
}
