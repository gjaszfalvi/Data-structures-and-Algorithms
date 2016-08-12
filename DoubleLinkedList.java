/*
 * DoubleLinkedList.java
 * basic Double Linked List example
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class DoubleLinkedList implements DLList {
    private DLNode curr;
    private DLNode head;
    private DLNode last;
    private int size;
    
    // constructor
    public DoubleLinkedList() {
        head = null;
        curr = head;
        last = curr;
        size = 0;
    }
    
    public void setCurrent(int i) {
        curr = head;
        for (int j = 1; j < i; j++) {
            curr = curr.getNext();
        }
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
    public void add(int i, Object o) {
        // list is empty
        if (isEmpty()) {
            DLNode newNode = new DLNode(o,null,null);
            head = newNode;
            last = newNode;
        } else
        // index is 1, inserting as first element    
        if (i == 1) {
            DLNode newNode = new DLNode(o,null,null);
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        } else
        // index is size+1, inserting at the end of the list
        if (i == size+1) {
            DLNode newNode = new DLNode(o,null,null);
            newNode.setPrev(last);
            last.setPrev(newNode);
            last = newNode;
        } else {
        // inserting in the middle somewhere
            setCurrent(i);
            DLNode prev = curr.getPrev();
            DLNode newNode = new DLNode(o,null,null);
            prev.setNext(newNode);
            newNode.setPrev(newNode);
            newNode.setNext(curr);
            curr.setPrev(newNode);
        }
        size++;
    }

    @Override
    public void remove(int i) {
        if (size>0) {
            setCurrent(i);
            // removing the head
            if (curr == head) {
                head = curr.getNext();
                head.setPrev(null);
            } else
            // removing the last
            if (curr == last) {
                last = curr.getPrev();
                last.setNext(null);
            } else {
            // removing from middle somewhere
                DLNode next = curr.getNext();
                DLNode prev = curr.getPrev();
                prev.setNext(next);
                next.setPrev(prev);
            }
            // deleting reference to free up memory
            curr = null;
            size--;
        }
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
    
}
