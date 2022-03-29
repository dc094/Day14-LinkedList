package com.bridgelabz.datastructure;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyLinkedListTest {

    @Test
    public void given3NumberWhenAddedToLinkedList_ShouldBeAddedToTop() {
        System.out.println("Test Case 2 : Ability to add 30 and 56 to 70 ");
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList mylinkedlist = new MyLinkedList();
        mylinkedlist.add(myFirstNode);
        mylinkedlist.add(mySecondNode);
        mylinkedlist.add(myThirdNode);
        mylinkedlist.printMyNodes();
        boolean result = mylinkedlist.head.equals(myThirdNode) &&
                mylinkedlist.head.getNext().equals(mySecondNode) &&
                mylinkedlist.tail.equals(myFirstNode);
        assertTrue(result);
    }
}
