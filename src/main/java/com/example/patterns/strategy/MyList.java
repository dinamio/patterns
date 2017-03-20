package com.example.patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by eugen on 3/17/17.
 */
@Component
@ToString
@AllArgsConstructor
public class MyList {

    private Integer[] array;

    private Integer size;

    private SortingStrategy sortingStrategy;

    public void performSort() {
        array = sortingStrategy.sort(array,size);
    }


}
