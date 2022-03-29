package com.bridgelabz.datastructure;

public class MyLinkedList {
    INode head;
    INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode newNode) {
        if (this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void Insert(INode myFirstNode, INode newNode) {
        INode tempNode = myFirstNode.getNext();
        myFirstNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode secondLastNode = this.head;
        while (secondLastNode.getNext().getNext() != null)
            secondLastNode = secondLastNode.getNext();
        secondLastNode.setNext(null);
        return this.head;
    }

    public boolean search(INode node) {
        INode tempNode = head;
        boolean found = false;
        while (tempNode.getNext() != null) {
            if (tempNode.getKey() == node.getKey()) {
                found = true;
            }
            tempNode = tempNode.getNext();
        }
        return found;
    }

    public void searchAndInsert(INode searchNode, INode insertNode) {
        MyLinkedList n = new MyLinkedList();
        INode tempNode = head;
        boolean inserted = false;
        while (tempNode.getNext() != null) {
            if (tempNode.getKey() == searchNode.getKey()) {
                n.Insert(searchNode, insertNode);
            }
            tempNode = tempNode.getNext();
        }
    }

    public void searchAndDelete(INode deleteNode) {
        MyLinkedList n = new MyLinkedList();
        INode tempNode = head;
        boolean inserted = false;
        while (tempNode.getNext() != null) {
            if (tempNode.getKey() == deleteNode.getKey()) {
                n.pop();
            }
            tempNode = tempNode.getNext();
        }
    }

    public int size() {
        INode tempNode = head;
        int count = 1;
        while (tempNode.getNext() != null) {
            count++;
            tempNode = tempNode.getNext();
        }
        return count;
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
