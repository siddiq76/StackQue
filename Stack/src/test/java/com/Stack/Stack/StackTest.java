package com.Stack.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StackTest 
{
	Stack stack;
	@Before
	public void init() {
		stack = new Stack();
		stack.push(10);
		stack.push(40);
		stack.push(5);
	}
    /**
     * Tests whether top correctly points to the last added element
     */
    @Test
    public void pushOnStackTest_Correct(){
        assertEquals(stack.getTop().getData() , stack.getStack().returnFirst());
    }
    /**
     * Tests whether the element order is not reverse.
     */
    @Test
    public void pushOnStackTest_InCorrect(){
        assertNotEquals(10 , stack.getStack().returnFirst());
    }
}
