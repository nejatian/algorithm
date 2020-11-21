package com.nejatian;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        private Node(int value){
           this.value=value;

        }


    }
    private Node first;
    private Node last;
    //add last
    public void addLast(int item){
    Node node= new Node(item);
    if(first == null)
        first = last = node;
    else {
        last.next = node;
        last = node;
    }

    }
}
