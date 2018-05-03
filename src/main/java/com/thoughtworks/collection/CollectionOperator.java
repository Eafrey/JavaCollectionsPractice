package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> res = new ArrayList<>();
        boolean add = left < right ? true : false;

        for(int i=left; i!=right;) {
            res.add(i);
            if(add) {
                i++;
            } else {
                i--;
            }
        }
        res.add(right);
        return  res;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> res = new ArrayList<>();
        boolean add = left < right ? true : false;

        for(int i=left; i!=right;) {
            if(i % 2 == 0) {
                res.add(i);
            }

            if(add) {
                i++;
            } else {
                i--;
            }
        }
        if(right % 2 == 0) {
            res.add(right);
        }

        return  res;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> evenList = new ArrayList<>();
        for(int num : array) {
            if(num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    public int popLastElment(int[] array) {
        return  array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> common = new ArrayList<>();
        for(int num1 : firstArray) {
            for(int num2 : secondArray) {
                if(num1 == num2) {
                    common.add(num1);
                }
            }
        }

        return common;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> res = new ArrayList<>();

        for(int num : firstArray) {
            res.add(num);
        }

        for(int num2 : secondArray) {
            boolean firstContain = false;
            for(int num1 : firstArray) {
                if(num1 == num2) {
                    firstContain = true;
                }
            }

            if(!firstContain) {
                res.add(num2);
            }
        }

        return res;
    }
}
