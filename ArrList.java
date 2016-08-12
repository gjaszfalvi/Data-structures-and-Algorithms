/*
 * ArrList.java
 * Basic ArrayList example
 * @author Gabor Jaszfalvi
 * 2016
 */
package DataStrAlg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrList {
    public static void main(String[] args) {
        // declaring the new collection (arraylist)
        ArrayList<String> myList = new ArrayList();
        
        // populating the list
        myList.add("four");
        myList.add("score");
        myList.add("and");
        myList.add("seven");
        myList.add("John");
        myList.add("ago");
        
        // display list before and after sorting
        System.out.println("before sorting: " + myList.toString());
        Collections.sort(myList);
        System.out.println("after sorting: " + myList.toString());
        
        // check if contains
        if (myList.contains("John")) {
            System.out.println("John is in the list at position " + myList.indexOf("John"));
        } else {
            System.out.println("John is not here...");
        }
        
        // iterating over the list
        Iterator i = myList.iterator();
        System.out.println("Iterating the list");
        while (i.hasNext()) {
            System.out.println("Element " + i.next());
        }
        
        // traversing the list with a for loop
        System.out.println("Traversing with for loop");
        for (int j = 0; j < myList.size(); j++) {
            System.out.println("Element " + myList.get(j));
        }
    }
}
