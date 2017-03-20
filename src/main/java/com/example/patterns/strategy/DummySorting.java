package com.example.patterns.strategy;

/**
 * Created by eugen on 3/17/17.
 */
public class DummySorting implements SortingStrategy {
    @Override
    public Integer[] sort(Integer[] array, Integer size) {
        System.out.println("I'm not sorting at all");
        return null;
    }
}
