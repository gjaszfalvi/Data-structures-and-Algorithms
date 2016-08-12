/*
 * LinearList.java
 * LinearList interface example for Single Linked List
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public interface LinearList {
    public boolean isEmpty();
    public int size();
    public void add(Object o);
    public void add(int i, Object o);
    public void remove(int i);
    public Object get(int i);
    public void printList();
}
