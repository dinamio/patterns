package com.example.patterns.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eugen on 3/19/17.
 */
public class QuickSorting implements SortingStrategy {
    @Override
    public Integer[] sort(Integer[] array, Integer size) {
        if (size <= 1) {
            return array;
        }
        Integer el = array[size/2];
        List<Integer> less = new ArrayList<>();
        List<Integer> more = new ArrayList<>();
        for(int i=0;i<size;i++) {
            if (array[i] < el && i!=size/2)
                less.add(array[i]);
            if (array[i] >= el && i!=size/2)
                more.add(array[i]);
        }
        return concat(sort(less.toArray(new Integer[less.size()]),less.size()),el,sort(more.toArray(new Integer[more.size()]),more.size()));
    }

    public static Integer[] concat(Integer[] less, Integer el, Integer[] more ) {
        Integer[] result = new Integer[less.length + more.length + 1];
        int i=0;
        for(int j=0;j<less.length;j++) {
            result[i]=less[j];
            i++;
        }
        result[i] = el;
        i++;
        for(int j=0;j<more.length;j++) {
            result[i]=more[j];
            i++;
        }
        return result;
    }
}
