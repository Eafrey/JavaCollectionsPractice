package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> res = new ArrayList<>();
        for(int num : array) {
            res.add(num*3);
        }
        return res;
    }

    public List<String> mapLetter() {
        List<String> res = new ArrayList<>();
        for(int num : array) {
            res.add(letters[num-1]);
        }
        return res;
    }

    public List<String> mapLetters() {
        List<String> res = new ArrayList<>();

        for(int num : array) {
            String str = new String();
            while(num > 26) {
                int x = (num-1) / 26;
                str += letters[x-1];
                num = num - 26 * x;
            }
            res.add(str + letters[num-1]);
        }
        return res;
    }

    public List<Integer> sortFromBig() {
        Collections.sort(array);
        Collections.reverse(array);
        return array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(array);
        return array;
    }
}
