package org.howard.edu.assignment5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class IntegerSetTest {
	private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    public void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
        
    }

    @Test
    @DisplayName("Test case for clear")
    void testClear() {
        set1.add(1);
        set1.clear();
        assertTrue(set1.isEmpty());
        set1.add(2);
        assertFalse(set1.isEmpty());
        
    }

    @Test
    @DisplayName("Test case for length")
    void testLength() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        assertEquals(3, set1.length());
        
    }

    @Test
    @DisplayName("Test case for equals")
    void testEquals() {
        set1.add(1);
        set1.add(2);
        set2.add(1);
        set2.add(2);
        assertTrue(set1.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains")
    void testContains() {
        set1.add(1);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
    }

    @Test
    @DisplayName("Test case for largest")
    void testLargest() throws IntegerSetException {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        assertTrue(3 == set1.largest());
        assertFalse(2 ==set1.largest());
        set1.clear();
        Throwable exception= assertThrows(IntegerSetException.class, () -> set1.largest());
        assertEquals("The set is empty", exception.getMessage());
        assertTrue(1 == set1.largest());
        assertFalse(3 == set1.largest());
 
    }

    @Test
    @DisplayName("Test case for smallest")
    void testSmallest() throws IntegerSetException {
    	set1.add(1);
        set1.add(2);
        set1.add(3);
        assertTrue(1 == set1.smallest());
        assertFalse(3 == set1.smallest());
        set1.clear();
        Throwable exception= assertThrows(IntegerSetException.class, () -> set1.smallest());
        assertEquals("The set is empty", exception.getMessage());
        assertTrue(1 == set1.smallest());
        assertFalse(3 == set1.smallest());
        
    }

    @Test
    @DisplayName("Test case for add")
    void testAdd() {
        set1.add(1);
        assertTrue(set1.contains(1));
    }

    @Test
    @DisplayName("Test case for remove")
    void testRemove() {
        set1.add(2);
        set1.add(4);
        set1.remove(4);
        assertTrue(set1.contains(2));
        assertFalse(set1.contains(4));
    }

    @Test
    @DisplayName("Test case for union")
    void testUnion() {
    	set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        
        // Adding elements to the secondIntegerSet
       set2.add(5);
       set2.add(6);
        
        // Union of both sets should contain all unique elements
        set1.union(set2);
        
        assertEquals("[1, 2, 3, 4, 5, 6]", set1.toString());
    }

    @Test
    @DisplayName("Test case for intersect")
    void testIntersect() {
    	IntegerSet set2 = new IntegerSet();
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertEquals("[2]", set1.toString());
    }

    @Test
    @DisplayName("Test case for diff")
    void testDiff() {
        set1.add(3);
        set1.add(6);
        set1.add(9);
        set2.add(2);
        set2.add(9);
        set1.diff(set2);
        assertEquals("[3, 6]", set1.toString());
    }

    @Test
    @DisplayName("Test case for complement")
    void testComplement() {
    	
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set1.complement(set2);
        assertEquals("[4]",set1.toString());
    }

    @Test
    @DisplayName("Test case for isEmpty")
    void testIsEmpty() {
        assertTrue(set1.isEmpty());
        set1.add(1);
        assertFalse(set1.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    void testToString() {
        set1.add(5);
        set1.add(10);
        assertEquals("[5, 10]", set1.toString());
    }
}

