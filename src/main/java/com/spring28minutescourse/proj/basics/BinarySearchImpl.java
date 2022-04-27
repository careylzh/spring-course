package com.spring28minutescourse.proj.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    private SortingAlgo sortingAlgo; //autowiring by name: you can also perform autowiring by referencing the name of the dependency instance generated during runtime

    //(prev concept on dependency injection using constructors vs setters): this thing is actually optional for dependency injection in Spring. somehow Spring knows that you will be injecting a dependency into BinarySearchImpl without defining the constructor
    public BinarySearchImpl(SortingAlgo sortingAlgo) {
        super();
        this.sortingAlgo = sortingAlgo;
    }


    public int binarySearch(int[] numbers, int numberToSearchFor) {
        //Implement the sorting algo here, which should be a variable dependency of binary search


        int[] sortedNumber = sortingAlgo.sort(numbers);
        System.out.println(sortingAlgo);

        //Search an array
        //Return the result(index of the target element)
        return 3; //for now
    }
}
