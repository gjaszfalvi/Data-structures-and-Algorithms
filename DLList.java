/*
 * DL.java
 * DLList interface example for Double Linked List
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public interface DLList {
    public boolean isEmpty();
    public int size();
    public void add(int i, Object o);
    public void remove(int i);
    public Object get(int i);
    public void printList();
}
