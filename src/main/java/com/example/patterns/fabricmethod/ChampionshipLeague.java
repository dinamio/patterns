package com.example.patterns.fabricmethod;

import com.example.patterns.observer.Game;
import javafx.util.Pair;

import java.lang.annotation.Target;
import java.util.Random;

/**
 * Created by eugen on 3/20/17.
 */
public abstract class ChampionshipLeague {


    public abstract Game getGame();

    public void playGame() {
        Game game = getGame();
        Random random = new Random();
        game.setFirstGoals(random.nextInt(5));
        game.setSecondGoals(random.nextInt(5));
        System.out.println(game);
    }

}
