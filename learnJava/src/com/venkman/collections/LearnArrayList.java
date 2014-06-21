package com.venkman.collections;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		
		// Instantiate with the List interface as type
		List<Integer> numbers = new ArrayList<Integer>();
		
		// Adding to ArrayList appends
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		// Use get() to retrieve
		System.out.println(numbers.get(0));
		
		// Indexed for-loop iteration
		System.out.println("Traditional for-loop iteration");
		for (int i=0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		// Better for-loop iteration
		System.out.println("More readable for-loop");
		for (Integer value: numbers) {
			System.out.println(value);
		}
		
		// Removing items from the end of ArrayList decreases the size of the internal array.
		// This is reasonably fast.
		numbers.remove(numbers.size() - 1);
		
		// Removing from the front of the array is very slow because internally,
		// all array members are copied one step to the left after removing from the 'front' of the array.
		numbers.remove(0);
		
		// If you want to remove from the front or middle of a large list, it's better to use LinkedList.
		

	}

}
