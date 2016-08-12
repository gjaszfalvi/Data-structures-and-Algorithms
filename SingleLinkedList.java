/*
 * SingleLinkedList.java
 * basic Single Linked List example
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class SingleLinkedList implements LinearList {
    private Node head;      // reference to the first element
    private Node curr;      // the current element
    private Node prev;      // the previous element
    private int size;       // the size of the list

    // constructor
    public SingleLinkedList() {
        head = null;
        curr = head;
        prev = null;
        size = 0;
    }

    // setting the current Node
    public void setCurrent(int i) {
        prev = null;
        curr = head;
        for (int j = 1; j < i; j++) {
            prev = curr;
            curr = curr.getNext();
        }
        // now the current is curr, and previous is prev
    }
    
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object o) {
        // inserting a Node to the front of the list
        Node newNode = new Node(o, head);
        head = newNode;
        size++;
    }

    @Override
    public void add(int i, Object o) {
        // in case of inserting a Node to the front
        if (i == 1) {
        Node newNode = new Node(o, head);
        head = newNode;
        }
        // otherwise
        else {
            setCurrent(i);
            Node newNode = new Node(o, curr);
            prev.setNext(newNode);
        }
        size++;
    }

    @Override
    public void remove(int i) {
        // in case of removing the first element
        if (i == 1) {
            head = head.getNext();
        } 
        // otherwise
        else {
        setCurrent(i);
        prev.setNext(curr.getNext());
        }
        size--;
    }

    @Override
    public Object get(int i) {
        setCurrent(i);
        return curr;
    }

    @Override
    public void printList() {
        curr = head;
        while (curr != null) {
            System.out.println("Element " + curr.getElement().toString());
            curr = curr.getNext();
        }
    }
    
    public void printReverseList() {
        setCurrent(size);
        for (int i = 1; i <= size; i++) {
            System.out.println("Element " + curr.getElement().toString());
            setCurrent(size-i);
        }
    }
}