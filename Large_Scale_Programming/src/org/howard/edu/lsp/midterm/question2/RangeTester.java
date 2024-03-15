package org.howard.edu.lsp.midterm.question2;


public class RangeTester {
	public static void main(String[] args) {
     // Creating IntegerRange instances for testing
     IntegerRange range1 = new IntegerRange(1, 10);
     IntegerRange range2 = new IntegerRange(5, 15);
     IntegerRange range3 = new IntegerRange(20, 30);

     // Test contains method
     System.out.println("Does range1 contain 5? " + range1.contains(5));  // true
     System.out.println("Does range2 contain 12? " + range2.contains(12));  // true
     System.out.println("Does range3 contain 35? " + range3.contains(35));  // false

     // Test overlaps method
     System.out.println("Do range1 and range2 overlap? " + range1.overlaps(range2));  // true
     System.out.println("Do range1 and range3 overlap? " + range1.overlaps(range3));  // false

     // Test size method
     System.out.println("Size of range1: " + range1.size());  // 10
     System.out.println("Size of range2: " + range2.size());  // 11
     System.out.println("Size of range3: " + range3.size());  // 11

     // Test equals method
     IntegerRange range4 = new IntegerRange(1, 10);
     System.out.println("Are range1 and range4 equal? " + range1.equals(range4));  // true
 }
}

