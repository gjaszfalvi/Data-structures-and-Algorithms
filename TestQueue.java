/*
 * StackInterface.java
 * basic interface for the stack
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class TestQueue {
    public static void main(String[] args) {
        // create an object of class Queue
        Queue myQueue = new Queue();

        // populating the queue
        myQueue.enqueue("first");
        myQueue.enqueue("second");
        myQueue.enqueue("third");
        myQueue.enqueue("fourth");
        myQueue.enqueue("fifth");
        
        // checking the last and the first in the queue without removing
        System.out.println(myQueue.frontElement());
        System.out.println(myQueue.rearElement());
        
        // removing the last from the queue
        System.out.println(myQueue.dequeue());
        
    }
}
