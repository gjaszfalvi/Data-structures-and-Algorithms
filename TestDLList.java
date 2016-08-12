/*
 * TestList.java
 * testing the Double Linked List
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class TestDLList {
    public static void main(String[] args) {
        // instantiate a new DLL object
        DoubleLinkedList newList = new DoubleLinkedList();
        // populate the list
        newList.add(1,"Tony");
        newList.add(1,"Brad");
        newList.add(2,"Alex");
        newList.add(1,"Matthew");
        newList.add(2,"Josh");
        
        // traversing in order
        System.out.println("Traversing in order");
        newList.printList();
        
    }
}
