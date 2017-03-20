package com.example.patterns.fabricmethod;

import com.example.patterns.observer.Game;

/**
 * Created by eugen on 3/20/17.
 */
public class FirstLeague  extends ChampionshipLeague{
    @Override
    public Game getGame() {
        Game game = new Game();
        game.setFirstTeam(new Dynamo().getName());
        game.setSecondTeam(new Shahter().getName());
        return game;
    }
}
