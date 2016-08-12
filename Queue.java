/*
 * Queue.java
 * basic Queue example
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

import java.util.ArrayList;

public class Queue implements QueueInterface {
    // instantiating a queue object
    ArrayList<String> aQueue = new ArrayList<String>();
    @Override
    public boolean isEmpty() {
        return aQueue.isEmpty();
    }

    @Override
    public int size() {
        return aQueue.size();
    }

    // return the front element without removing
    @Override
    public Object frontElement() {
        if (!(aQueue.isEmpty())) {
            return aQueue.get(aQueue.size()-1);
        } else {
            return null;
        }
    }
    
    // return the rear element without removing
    @Override
    public Object rearElement() {
        if (!(aQueue.isEmpty())) {
            return aQueue.get(0);
        } else {
            return null;
        }
    }

    // add an element to the list
    @Override
    public void enqueue(Object o) {
        aQueue.add(0, (String)o);
    }

    // remove an element from the end of the queue
    @Override
    public Object dequeue() {
        if (!(aQueue.isEmpty())) {
            return aQueue.remove(aQueue.size()-1);
        } else {
            return null;
        }
    }    
}
