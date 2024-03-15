package org.howard.edu.lsp.midterm.question2;

public class IntegerRange implements Range {
 private final int lowerBound;
 private final int upperBound;

 /**
  * Constructs an IntegerRange with the specified lower and upper bounds.
  *
  * @param lowerBound the lower bound of the range (inclusive)
  * @param upperBound the upper bound of the range (inclusive)
  */
 public IntegerRange(int lowerBound, int upperBound) {
     this.lowerBound = lowerBound;
     this.upperBound = upperBound;
 }

 @Override
 public boolean contains(int value) {
     return value >= lowerBound && value <= upperBound;
 }

 @Override
 public boolean overlaps(Range other) {
     return !(upperBound < ((IntegerRange) other).lowerBound || lowerBound > ((IntegerRange) other).upperBound);
 }

 @Override
 public int size() {
     return upperBound - lowerBound + 1;
 }

 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (!(obj instanceof IntegerRange)) return false;
     IntegerRange other = (IntegerRange) obj;
     return lowerBound == other.lowerBound && upperBound == other.upperBound;
 }
}

