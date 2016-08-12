/*
 * BubbleSortSimple.java
 * Simple bubble sort example
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

import java.util.ArrayList;

public class BubbleSortSimple {
    public static ArrayList sequence = new ArrayList();
    public static void swap(int pos1, int pos2) {
        int elem1 = (int)sequence.get(pos1);
        int elem2 = (int)sequence.get(pos2);
        sequence.remove(pos1);                  // swapping elements simple way
        sequence.add(pos1,elem2);               
        sequence.remove(pos2);
        sequence.add(pos2,elem1);
    }
    
    public static void bubbleSort() {
    boolean moreSwaps = true;                   // to check if more swap needed
        while (moreSwaps) {                     // inefficient and slow
            moreSwaps = false;
            for (int i = 0; i < sequence.size()-1; i++) {
                int x = (int)sequence.get(i);
                int y = (int)sequence.get(i+1);
                if (x > y) {
                    swap(i,i+1);
                    moreSwaps = true;
                }
                System.out.println(sequence.toString());                
            }
        }
    }
    
    public static void bubbleSortAdv() {        // advanced sort with nested loop
        for (int i = 0; i < sequence.size(); i++) {
            for (int j = 0; j < sequence.size()-1-i; j++) {
                System.out.println(sequence.toString());
                int x = (int)sequence.get(j);
                int y = (int)sequence.get(j+1);
                if (x > y) {
                    swap(j,j+1);
                }
                System.out.println(sequence.toString());                
            }
        }
    }
    
    public static void bubbleSortPro() {
        int i,j;
        Comparable elem1,elem2;
        for (int k = 0; k < sequence.size(); k++) {
            for (int l = 0; l < sequence.size()-1-k; l++) {
                elem1 = (Comparable)sequence.get(l);
                elem2 = (Comparable)sequence.get(l+1);
                
                if (elem1.compareTo(elem2) > 0) {
                    swap(l,l+1);
                }
            System.out.println(sequence.toString());    
            }
        }
    }
         
    public static void main(String[] args) {  
        sequence.add(23);
        sequence.add(2);
        sequence.add(67);
        sequence.add(5);
        sequence.add(3);
        //bubbleSort();           // alt1 much slower
        //bubbleSortAdv();        // alt2 still not the best but a bit faster
        bubbleSortPro();
        System.out.println(sequence.toString());
    }
}
