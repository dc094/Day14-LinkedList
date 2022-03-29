package com.bridgelabz.datastructure;

import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(56);
        linkedList.add(30);
        linkedList.addLast(70);

        System.out.println(linkedList.get(0) + " -> " + linkedList.get(1) + " -> " + linkedList.get(2));
    }
}
