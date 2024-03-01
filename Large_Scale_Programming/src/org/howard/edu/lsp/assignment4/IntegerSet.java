package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.List;

public class IntegerSet  {
	// Store the set elements in an ArrayList
	private List<Integer> set = new ArrayList<Integer>();
	
	
	/**
	 * The IntegerSet class represents a set, which is a collection of elements where elements can be of any type.
	 * This class provides various methods to manipulate sets, including adding elements, removing elements, checking for the presence of elements,
	 * finding the largest and smallest elements, and clearing the set.
	 */
	// Default Constructor
	public IntegerSet() {
	}
	
	
	/**
	Returns the list containing all elements of the set.
	*/
	// self made 
	public List <Integer> getSet(){  
		return this.set;
	}
	
	/**
	 *  Constructs an IntegerSet with the specified ArrayList of integers.
	 */
	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
	
/**
* Clears all elements from the internal representation of the set.
*/
// Clears the internal representation of the set
public void clear() {
	set.clear();
};


/**
 * Returns the number of elements in the set.
 */
// Returns the length of the set
public int length() {
	return set.size();
}; 

/**
 * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
 * the equal method from the Object class.
*/
@Override
public boolean equals(Object o) {
	if (o instanceof IntegerSet) {
		IntegerSet otherSet = (IntegerSet)o;
		return this.set.containsAll(otherSet.set) && otherSet.set.containsAll(this.set);
		
	}
	return false;

}; 
/**
 * Checks if the set contains the specified value.
 * 
 * @param value The value to check for.
 * @return true if the set contains the value, otherwise false.
 */
// Returns true if the set contains the value, otherwise false
public boolean contains(int value) {
	return set.contains(value);
};    
/**
 * Returns the largest item in the set.
 * 
 * @return The largest item in the set.
 * @throws IntegerSetException If the set is empty.
 */
// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
public int largest() throws IntegerSetException{
	if (set.isEmpty()) {
		throw new IntegerSetException("The set is empty");
	}
	int max = set.get(0);
    for (int num : set) {
        if (num > max) {
            max = num;
        }
    }
    return max;
	
}; 
//Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
/**
 * Returns the smallest item in the set.
 * @return The smallest item in the set.
 * @throws IntegerSetException If the set is empty.
 */
public int smallest() throws IntegerSetException{
	if (set.isEmpty()) {
		throw new IntegerSetException("The set is empty");
		
	}
	int smallest = Integer.MAX_VALUE;
	for (int num : set) {
		if (num < smallest) {
			smallest = num;
		}
		
         }
	return smallest;
	
};

// Adds an item to the set or does nothing it already there	
/**
 * Adds an item to the set if it is not already present.
 * 
 * @param item The item to add to the set.
 */
 	public void add(int item) {
 		if(!set.contains(item)){
 			set.add(item);
 			
 		}
 	}; 
 

 	/**
 	 * Removes an item from the set if it exists, otherwise does nothing.
 	 * @param item The item to remove from the set.
 	 */
	// Removes an item from the set or does nothing if not there
 	public void remove(int item) {
 	    set.remove(Integer.valueOf(item));
	
	
}; 
/**
 * Computes the union of the set with another set.
 * @param intSetb The other set to compute the union with.
 */
// Set union
public void union(IntegerSet intSetb) {
	for(int item: intSetb.getSet()){
		this.set.add(item);
	}
	
};

/**
 * Computes the intersection of the set with another set.
 * @param intSetb The other set to compute the intersection with.
 */
// Set intersection, all elements in s1 and s2
public void intersect(IntegerSet intSetb) {
	this.set.retainAll(intSetb.getSet());
	}

/**
 * Computes the set difference, i.e., elements in this set but not in the other set.
 * 
 * @param intSetb The other set to compute the difference with.
 */
// Set difference, i.e., s1 –s2
public void diff(IntegerSet intSetb) {
	this.set.removeAll(intSetb.getSet());
}


/**
 * Computes the complement of the set, containing all elements not in another set.
 * 
 * @param intSetb The other set to compute the complement with.
 */
// Set complement, all elements not in s1
public void complement(IntegerSet intSetb) {
		for(int i = intSetb.set.size()-1; i >=0; i--) {
			if(this.set.contains(intSetb.set.get(i))){ 
				intSetb.set.remove(i);
			}
		}
		this.set.clear();
		this.set.addAll(intSetb.set);
	}



/**
 * Checks if the set is empty.
 * 
 * @return true if the set is empty, false otherwise.
 */
// Returns true if the set is empty, false otherwise
boolean isEmpty() {
	return this.length() == 0;
}

/**
 * Returns the string representation of the set.
 * This method overrides the default implementation of the toString method from the Object class.
 * @return The string representation of the set.
 */
// Return String representation of your set.  This overrides the equal method from the Object class.
@Override
public String toString() {
	return set.toString();
	
};	
}
