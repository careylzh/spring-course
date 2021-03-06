package com.spring28minutescourse.proj.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgo implements SortingAlgo {
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
