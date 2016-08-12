/*
 * StackInterface.java
 * basic interface for the stack
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public interface StackInterface {
    public boolean isEmpty();
    public boolean isFull();
    public void push(Object o);
    public Object pop();
}
