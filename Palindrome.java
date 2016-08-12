/*
 * Palindrome.java
 * simple recursion practice with palindrome word check
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

public class Palindrome {
    public static int n = 0;
    public static boolean palindrome(String word) {
        int length = word.length()-1;
        char first = word.charAt(0+n);
        char last = word.charAt(length-n);
        if (first != last) {                        // base case
            return false;
        } else {
            word = word.substring(1, length-1);     // recursive case
            palindrome(word);
            n=n+1;
            return true;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(palindrome("indulagorogaludni"));
    }
}
