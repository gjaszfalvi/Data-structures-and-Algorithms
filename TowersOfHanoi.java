/*
 * TowersOfHanoi.java
 * Recursion practice with Towers Of Hanoi game
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

import java.util.Scanner;

public class TowersOfHanoi {

    // the goal is to move N discs from one pin to another using three pins
    // the smaller pin (number) should be always on top
    public void solve(int n, String start, String helper, String goal) {
        if  (n==1) {

            // base case if there is only one disc
            System.out.println("Move disc 1 from " + start + " to " + goal);

        } else {
            
            // recursive case, if there is more than one disc, move the smaller disc to the helper pin
            // then move the bigger disc to the goal pin
            solve(n-1,start, goal, helper);
            System.out.println("Move disc " + n + " from " + start + " to " + goal);
            solve(n-1,helper,start,goal);
        }
    }

    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        towersOfHanoi.solve(discs, "1", "2", "3");
    }
}