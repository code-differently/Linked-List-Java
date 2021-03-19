package com.codedifferently.collections.lists;

public class Node<E> {
    private E key;
    private Node next;

    public Node(E data){
        key = data;
        next = null;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public String toString(){
        return key.toString();
    }
}
