package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;

/**
 * The Driver class contains the main method to test the functionality of the IntegerSet class.
 * It performs various tests on the IntegerSet class methods and prints the results.
 */

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		// Test case for constructor and toString method
        IntegerSet set1 = new IntegerSet();
        System.out.println("Set1: " + set1.toString());

        // Test case for add method
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1 after adding elements: " + set1.toString());

        // Test case for constructor with initialized set
        ArrayList<Integer> initialSet = new ArrayList<>();
        initialSet.add(3);
        initialSet.add(4);
        initialSet.add(5);
        IntegerSet set2 = new IntegerSet(initialSet);
        System.out.println("Set2: " + set2.toString());

        // Test case for clear method
        set1.clear();
        System.out.println("Set1 after clearing: " + set1.toString());

        // Test case for length method
        System.out.println("Length of Set2: " + set2.length());

        // Test case for equals method
        System.out.println("Is Set1 equal to Set2? " + set1.equals(set2));

        // Test case for contains method
        System.out.println("Does Set2 contain 4? " + set2.contains(4));

        // Test case for largest method
        try {
            System.out.println("Largest value in Set1: " + set1.largest());
        } catch (IntegerSetException e) {
            System.out.println(e.getMessage());
        }

        // Test case for smallest method
        try {
            System.out.println("Smallest value in Set2: " + set2.smallest());
        } catch (IntegerSetException e) {
            System.out.println(e.getMessage());
        }

        // Test case for remove method
        set2.remove(4);
        System.out.println("Set2 after removing 4: " + set2.toString());

        // Test case for union method
        set1.union(set2);
        System.out.println("Union of Set1 and Set2: " + set1.toString());

        // Test case for intersect method
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
       
        set1.intersect(set2);
        System.out.println("Intersection of Set1 and Set2: " + set1.toString());
        

        // Test case for diff method
        set1.diff(set2);
        System.out.println("Difference of Set1 and Set2: " + set1.toString());

        // Test case for complement method
       
        set1.complement(set2);
        System.out.println("Complement of Set1 with respect to Set2: " + set1.toString());

        // Test case for isEmpty method
        System.out.println("Is Set1 empty? " + set1.isEmpty());
    }
}

