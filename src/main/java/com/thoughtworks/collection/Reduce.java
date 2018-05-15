package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int max = Integer.MIN_VALUE;

        for(int num : arrayList) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    public double getMinimum() {
        double min = Double.MAX_VALUE;

        for(int num : arrayList) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    public double getAverage() {
        double average = 0;
        double sum = 0.0;

        for(int num : arrayList) {
            sum += num;
        }
        average = sum / arrayList.size();

        return average;
    }

    public double getOrderedMedian() {
        double mid = 0;
        int midIndex = (arrayList.size()-1) / 2;
        if(arrayList.size() % 2 == 0) {
            mid = (arrayList.get(midIndex) + arrayList.get(midIndex+1)) / 2.0;
        } else {
            mid = arrayList.get(midIndex);
        }
        return mid;
    }

    public int getFirstEven() {
        int firstEven = 0;
        for(int num : arrayList) {
            if(num % 2 == 0) {
                firstEven = num;
                break;
            }
        }
        return firstEven;
    }

    public int getIndexOfFirstEven() {
        int firstEvenIndex = 0;
        for(int i=0; i<arrayList.size(); i++) {
            if(arrayList.get(i) % 2 == 0) {
                firstEvenIndex = i;
                break;
            }
        }
        return firstEvenIndex;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if(this.arrayList.size() != arrayList.size()) {
            return false;
        }
        boolean res = true;
        for(int i=0; i<arrayList.size(); i++) {
            if(this.arrayList.get(i) != arrayList.get(i)) {
                res = false;
                break;
            }
        }
        return res;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        double mid = 0;

        for(int num : arrayList) {
            singleLink.addTailPointer(num);
        }
        int size = arrayList.size();
        int midIndex = (arrayList.size()-1) / 2;
        if(size % 2 == 0) {
            int x1 = (int) singleLink.getNode(midIndex+1);
            int x2 = (int) singleLink.getNode(midIndex+2);
            mid = (x1 + x2) / 2.0;
        } else {
            mid = (double) singleLink.getNode(midIndex);
        }


        return mid;
    }

    public int getLastOdd() {
        int lastOdd = -1;
        for(int num : arrayList) {
            if(num % 2 != 0) {
                lastOdd = num;
            }
        }
        return lastOdd;
    }

    public int getIndexOfLastOdd() {
        int lastOddIndex = -1;
        for(int i=0; i<arrayList.size(); i++) {
            if(arrayList.get(i) % 2 != 0) {
                lastOddIndex = i;
            }
        }
        return lastOddIndex;
    }
}
