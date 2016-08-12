/*
 * DLNode.java
 * Node example for Double Linked List
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class DLNode {
    private Object element;
    private DLNode next;
    private DLNode prev;
    
    public DLNode(Object e, DLNode n, DLNode p) {
        element = e;
        next = n;
        prev = p;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }

    public DLNode getPrev() {
        return prev;
    }

    public void setPrev(DLNode prev) {
        this.prev = prev;
    }
    
    
    
}
