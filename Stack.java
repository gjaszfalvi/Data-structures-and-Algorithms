/*
 * StackInterface.java
 * basic interface for the stack
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack implements StackInterface {
    // create an object of class Stack
    public ArrayList<String> aStack = new ArrayList<String>();
    
    @Override
    public boolean isEmpty() {
        return aStack.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void push(Object o) {
        aStack.add(0, (String)o);       // downcasting as it could only be String
    }

    // remove and return the top element of the stack
    @Override
    public Object pop() {
        if (!(aStack.isEmpty())) {
            return aStack.remove(0);
        } else {
            return null;
        }
    }
    
    // take a peek in the stack without removing
    public Object peek() {
        if (!(aStack.isEmpty())) {
            return aStack.get(0);
        } else {
            return null;
        }
    }
    
    // delete the elements of the stack
    public void emptyStack() {
        aStack.clear();
    }
    
    // traversing the stack
    public void displayStack() {
        Iterator i = aStack.iterator();
        while (i.hasNext()) {
            System.out.println("Element " + i.next());  // no need for toString() as we declared String stack here
        }
    }
}
