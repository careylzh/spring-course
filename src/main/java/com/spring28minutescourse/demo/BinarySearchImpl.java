package com.spring28minutescourse.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortingAlgo bubbleSortAlgo; //autowiring by name: you can also perform autowiring by referencing the name of the dependency instance generated during runtime

    //this thing is actually optional for dependency injection in Spring. somehow Spring knows that 
//    public BinarySearchImpl(SortingAlgo sortingAlgo) {
//        super();
//        this.sortingAlgo = sortingAlgo;
//    }


    public int binarySearch(int[] numbers, int numberToSearchFor) {
        //Implement the sorting algo here, which should be a variable dependency of binary search


        int[] sortedNumber = bubbleSortAlgo.sort(numbers);
        System.out.println(bubbleSortAlgo);

        //Search an array
        //Return the result(index of the target element)
        return 3; //for now
    }
}
