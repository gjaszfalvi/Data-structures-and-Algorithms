/*
 * QueueInterface.java
 * Queue interface example
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public interface QueueInterface {
    public boolean isEmpty();
    public int size();
    public Object frontElement();
    public Object rearElement();
    public void enqueue(Object o);
    public Object dequeue();
}
