package com.thoughtworks.collection;
//
//public interface SingleLink<T> {
//    public T getHeaderData();
//    public T getTailData();
//    public int size();
//    public boolean isEmpty();
//    public boolean deleteFirst();
//    public boolean deleteLast();                //删除尾部元素；
//    public void addHeadPointer(T item);    //添加头指针
//    public void addTailPointer(T item);         //添加尾指针
//    public T getNode(int index);
//}

import java.util.LinkedList;
import java.util.List;

import java.util.LinkedList;
import java.util.List;

public class SingleLink<T>{
    List<T> list = new LinkedList<T>();

    public T getHeaderData() {
        return list.get(0);
    }

    public T getTailData() {
        return list.get(list.size()-1);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean deleteFirst() {
        if(list.size() < 1) {
            return false;
        }
        list.remove(0);
        return true;
    }

    public boolean deleteLast() {
        if(list.size() < 1) {
            return false;
        }
        list.remove(list.size()-1);
        return true;
    }

    public void addHeadPointer(T item) {
        list.add(0, item);
    }

    public void addTailPointer(T item) {
        list.add(item);
    }

    public T getNode(int index) {
        return list.get(index);
    }
}
