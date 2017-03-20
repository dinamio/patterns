package com.example.patterns.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by eugen on 3/19/17.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game extends Observable {

    String firstTeam;

    String secondTeam;

    Integer firstGoals;

    Integer secondGoals;

    public void scoreFirst() {
        firstGoals +=1;
        setChanged();
        notifyObservers("First scored");
    }

    public void scoreSecond() {
        secondGoals +=1;
        setChanged();
        notifyObservers("Second scored");
    }

    public boolean isDraw() {
        return firstGoals == secondGoals;
    }

    public String toString() {
        return "" + this.getFirstTeam() + " - " + this.getSecondTeam() + " " + this.getFirstGoals() + ":" + this.getSecondGoals();
    }
}
