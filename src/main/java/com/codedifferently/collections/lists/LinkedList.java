package com.codedifferently.collections.lists;

public interface LinkedList<E> {
    Node insertAtBeginning(E obj);
    Node insertAfter(Node<E> prev_node, E obj);
    Node insertAtEnd(E obj);
    Boolean contains(E obj);
    Boolean isEmpty();
    Boolean remove(E obj);
    Node getHeadNode();
}
