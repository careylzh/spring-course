package com.spring28minutescourse.demo;

public class BinarySearchImpl {
    public int binarySearch(int[] numbers, int numberToSearchFor){
        //Implement the sorting algo here, which should be a variable dependency of binary search

        //right now, binary search only implemented a fixed bubble sort algo
        BubbleSortAlgo bubbleSortAlgo = new BubbleSortAlgo();
        int[] sortedNumber = bubbleSortAlgo.sort(numbers);


        //Search an array
        //Return the result(index of the target element)
        return 3; //for now
    }
}
