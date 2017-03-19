package com.example.patterns.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by eugen on 3/19/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bid implements Observer {

    Game game;

    Double firstWin;

    Double draw;

    Double secondWin;

    @Override
    public void update(Observable o, Object arg) {
        if (arg.equals("First scored")) {
            firstWin -=1;
            secondWin +=1;

        }
        if (arg.equals("Second scored")) {
            firstWin +=1;
            secondWin -=1;
        }
        if (game.isDraw())
            draw-=0.5;
        else
            draw+=0.5;

    }
}
