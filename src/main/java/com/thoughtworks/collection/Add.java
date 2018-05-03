package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int res = 0;
        int small,big;
        if(leftBorder < rightBorder) {
            small = leftBorder;
            big = rightBorder;
        } else {
            small = rightBorder;
            big = leftBorder;
        }
        for(int i=small; i<=big; i++) {
            if(i % 2 == 0) {
                res += i;
            }
        }
        return res;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int res = 0;
        int small,big;
        if(leftBorder < rightBorder) {
            small = leftBorder;
            big = rightBorder;
        } else {
            small = rightBorder;
            big = leftBorder;
        }
        for(int i=small; i<=big; i++) {
            if(i % 2 != 0) {
                res += i;
            }
        }
        return res;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int res = 0;
        for(int num : arrayList) {
            res += num * 3 + 2;
        }
        return  res;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> res = new ArrayList<>();
        for(int num : arrayList) {
            if(num % 2 == 0) {
                res.add(num);
            } else {
                res.add(num*3+2);
            }
        }
        return res;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int res = 0;
        for(int num : arrayList) {
            if(num % 2 != 0) {
                res += num * 3 + 5;
            }
        }
        return res;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        double res = 0;
        List<Integer> evenList = new ArrayList<>();
        for(int num : arrayList) {
            if(num % 2 == 0) {
                evenList.add(num);
            }
        }
        Collections.sort(evenList);

        int mid = (evenList.size()-1) / 2;
        if(evenList.size() % 2 == 0) {
            res = (evenList.get(mid) + evenList.get(mid+1)) / 2.0;
        } else {
            res = evenList.get(mid);
        }
        return  res;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        double res = 0.0;
        List<Integer> evenList = new ArrayList<>();
        for(int num : arrayList) {
            if(num % 2 == 0) {
                evenList.add(num);
            }
        }

        double sum = 0.0;
        for(int num : evenList) {
            sum += num;
        }
        res = sum / evenList.size();

        return  res;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        boolean res = false;
        List<Integer> evenList = new ArrayList<>();
        for(int num : arrayList) {
            if(num % 2 == 0) {
                evenList.add(num);
            }
        }
        for(int num : evenList) {
            if(num  == specialElment) {
                res = true;
            }
        }
        return  res;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        for(int num : arrayList) {
            if(num % 2 == 0) {
                evenList.add(num);
            }
        }

        List<Integer> res = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        set.addAll(evenList);
        for(int num : set) {
            res.add(num);
        }
        return res;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        for(int num : arrayList) {
            if(num % 2 == 0) {
                evenList.add(num);
            }
        }

        List<Integer> oddList = new ArrayList<>();
        for(int num : arrayList) {
            if(num % 2 != 0) {
                oddList.add(num);
            }
        }
        Collections.reverse(oddList);

        List<Integer> res = new ArrayList<>();
        res.addAll(evenList);
        res.addAll(oddList);

        return res;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arrayList.size()-1; i++) {
            int num = (arrayList.get(i) + arrayList.get(i+1)) * 3;
            res.add(num);
        }
        return  res;
    }
}
