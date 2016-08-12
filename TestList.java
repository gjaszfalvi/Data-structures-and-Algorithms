/*
 * TestList.java
 * testing the Single Linked List
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class TestList {
    public static void main(String[] args) {
        SingleLinkedList newList = new SingleLinkedList();
        newList.add("Tony");
        newList.add("Brad");
        newList.add("Alex");
        newList.add("Matthew");
        newList.add("Josh");
        
        // traversing in order
        System.out.println("Traversing in order");
        newList.printList();
        
        // traversing in reverse order
        System.out.println("Traversing in reverse order");
        newList.printReverseList();
    }
}
