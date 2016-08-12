/*
 * Node.java
 * Node example for Single Linked List
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class Node {
    // a standard node contains an element and a link to its successor
    private Object element;
    private Node next;
    
    // constructor
    public Node(Object e, Node n) {
        element = e;
        next = n;
    }
    
    // get an element
    public Object getElement() {
        return element;
    }
    
    // set an element
    public void setElement(Object e) {
        element = e;
    }
    
    // get the successor
    public Node getNext() {
        return next;
    }
    
    //set the successor
    public void setNext(Node n) {
        next = n;
    }
}
