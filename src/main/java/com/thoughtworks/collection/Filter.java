package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> evenList = new ArrayList<>();
        for(int num : array) {
            if(num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> tripleList = new ArrayList<>();
        for(int num : array) {
            if(num % 3 == 0) {
                tripleList.add(num);
            }
        }
        return tripleList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> common = new ArrayList<>();
        for(int num1 : firstList) {
            for(int num2 : secondList) {
                if(num1 == num2) {
                    common.add(num1);
                }
            }
        }

        return common;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> res = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        set.addAll(array);
        for(int num : set) {
            res.add(num);
        }
        return res;
    }
}