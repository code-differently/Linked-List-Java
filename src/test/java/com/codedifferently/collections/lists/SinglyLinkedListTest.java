package com.codedifferently.collections.lists;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void insertTest(){
        // Given we have a SinglyLinkedList Object
        SinglyLinkedList<String> testList = new SinglyLinkedList<>();
        String expectedData = "Wutang Clan is the Greatest";

        //When we insert an object
        testList.insertAtBeginning(expectedData);
        Node<String> node = testList.getHeadNode();
        String actualData = node.getKey();

        // Expected
        Assert.assertEquals(expectedData, actualData);

    }

    @Test
    public void insertAfterTest(){

    }

    @Test
    public void insertAtEndTest(){
        SinglyLinkedList<String> testList = new SinglyLinkedList<>();
        String dataOne = "Burna Boy African Giant is my fav album";
        String dataTwo = "Wutang Clan is The Greatest";
        Node<String> node1 = testList.insertAtEnd(dataOne);
        Node<String> node2 = testList.insertAtEnd(dataTwo);

        String stringExpected = "Wutang Clan is The Greatest";
        String stringActual = node1.getNext().toString();

        Assert.assertEquals(stringExpected, stringActual);
    }

    @Test
    public void containsTest(){
        SinglyLinkedList<String> testList = new SinglyLinkedList<>();
        String dataString = "Can you Find Me";
        testList.insertAtEnd(dataString);

        Boolean contains = testList.contains(dataString);
        Assert.assertTrue(contains);
    }

    @Test
    public void isEmptyTest(){
        SinglyLinkedList<String> testList = new SinglyLinkedList<>();
        testList.insertAtEnd("Not Empty");
        Assert.assertFalse(testList.isEmpty());
    }

    @Test
    public void removeTest(){
        SinglyLinkedList<String> testList = new SinglyLinkedList<>();
        Node<String> node1 = testList.insertAtEnd("Burna Boy African Giant is my fav album");
        Node<String> node2 = testList.insertAtEnd("Wutang Clan is The Greatest");
        Boolean actual = testList.remove("Wutang Clan is The Greatest");
        Assert.assertFalse(actual);


    }

}
