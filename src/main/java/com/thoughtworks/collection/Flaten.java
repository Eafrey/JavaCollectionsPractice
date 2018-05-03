package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> res = new ArrayList<>();
        for(Integer[] arr : array) {
            for(int num : arr) {
                res.add(num);
            }
        }

        return res;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> list = new ArrayList<>();
        for(Integer[] arr : array) {
            for(int num : arr) {
                list.add(num);
            }
        }

        List<Integer> res = new ArrayList<>();

        for(int num : list) {
            if(!res.contains(num)) {
                res.add(num);
            }
        }

        return res;
    }
}
