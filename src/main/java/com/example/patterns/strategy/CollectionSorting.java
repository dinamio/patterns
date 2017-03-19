package com.example.patterns.strategy;

import java.util.Arrays;

/**
 * Created by eugen on 3/17/17.
 */
public class CollectionSorting implements SortingStrategy {
    @Override
    public void sort(Integer[] array, Integer size) {
        Arrays.sort(array);
    }
}
