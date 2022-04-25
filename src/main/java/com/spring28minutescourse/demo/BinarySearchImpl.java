package com.spring28minutescourse.demo;

public class BinarySearchImpl {
    private SortingAlgo sortingAlgo;
    public BinarySearchImpl(SortingAlgo sortingAlgo) {
        super();
        this.sortingAlgo = sortingAlgo;
    }


    public int binarySearch(int[] numbers, int numberToSearchFor){
        //Implement the sorting algo here, which should be a variable dependency of binary search


        int[] sortedNumber = sortingAlgo.sort(numbers);
        System.out.println(sortingAlgo);

        //Search an array
        //Return the result(index of the target element)
        return 3; //for now
    }
}
