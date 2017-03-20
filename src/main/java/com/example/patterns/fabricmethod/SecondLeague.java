package com.example.patterns.fabricmethod;

import com.example.patterns.observer.Game;

/**
 * Created by eugen on 3/20/17.
 */
public class SecondLeague extends ChampionshipLeague {
    @Override
    public Game getGame() {
        Game game = new Game();
        game.setFirstTeam(new Dnepr().getName());
        game.setSecondTeam(new Karpaty().getName());
        return game;
    }
}
