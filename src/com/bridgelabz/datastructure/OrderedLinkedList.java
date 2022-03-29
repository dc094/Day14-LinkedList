package com.bridgelabz.datastructure;

public class OrderedLinkedList<T extends Comparable<T>> {
    MyNode<T> head;
    MyNode<T> tail;
    MyNode<T> current;
    int position;


    public OrderedLinkedList() {
        head = null;
        current = null;
        tail = null;
        position = -1;
    }

    public void list() {
        MyNode<T> tempCurrent = head;
        while (tempCurrent != null) {
            System.out.print(tempCurrent.data + ",");
            tempCurrent = tempCurrent.next;
        }
    }

    public void printMyNodes() {

        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        MyNode<T> tempNode = head;
        while (tempNode.next != null) {
            myNodes.append(tempNode.data);
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.next;
        }
        myNodes.append(tempNode.data);
        System.out.println(myNodes);
    }

    public void add(T data) {

        MyNode<T> newNode = new MyNode<T>(data);
        if (head == null) {
            head = newNode;
            current = head;
        } else if (head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
        } else if (current.data.compareTo(data) < 0) {
            current.next = newNode;
            current = newNode;
        } else {
            MyNode<T> tempPrev = head;
            MyNode<T> tempCurrent = head.next;

            while ((tempCurrent != current) && (tempCurrent.data.compareTo(data) < 0)) {
                tempPrev = tempCurrent;
                tempCurrent = tempCurrent.next;

            }
            tempPrev.next = newNode;
            newNode.next = tempCurrent;
        }
        position++;
    }


    static class MyNode<T> {
        T data;
        MyNode<T> next;

        MyNode(T data) {
            this.data = data;
            next = null;
        }
    }

}
