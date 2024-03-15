package org.howard.edu.lsp.midterm.question2;

public interface Range {
 /**
  * Checks if the range contains the specified value.
  *
  * @param value the value to check
  * @return true if the value is within the range, false otherwise
  */
 boolean contains(int value);

 /**
  * Checks if the range overlaps with another range.
  *
  * @param other the other range to compare with
  * @return true if there is at least one common value, false otherwise
  */
 boolean overlaps(Range other);

 /**
  * Returns the number of integers in the range.
  *
  * @return the number of integers in the range
  */
 int size();
}

