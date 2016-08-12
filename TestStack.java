/*
 * TestStack.java
 * testing the STACK
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class TestStack {
    public static void main(String[] args) {
        // instantiate a new stack object;
        Stack myStack = new Stack();
        // populating the stack
        myStack.push("first");
        myStack.push("second");
        myStack.push("third");
        myStack.push("fourth");
        myStack.push("fifth");
        // let's pop some elements
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        // take a peek
        System.out.println(myStack.peek());
        // traverse the stack
        myStack.displayStack();
    }
}
