package com.venkman.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnLinkedList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList  = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	// Both ArrayList and LinkedList implement the List interface,
	// 	therefore we can pass both types/implementations into this
	// 	method without caring.
	private static void doTimings(String type, List<Integer> list) {
		
		long startLoadingList = System.currentTimeMillis();
		// Load list with 
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		long finishLoadingList = System.currentTimeMillis();
		
		System.out.println("Time taken to load list: " + (finishLoadingList - startLoadingList) + " ms for " + type + "\n");
		
		long startAddingToEndOfExisingList = System.currentTimeMillis();
		// Adds items at the end of an already large list.
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		long finishAddingToEndOfExistingList = System.currentTimeMillis();
		
		System.out.println("Time taken to add to end of existing list: " + (finishAddingToEndOfExistingList - startAddingToEndOfExisingList) + " ms for " + type + "\n");
		
		long startAddingToFrontOfExisingList = System.currentTimeMillis();
		// Adds items at the end of an already large list.
		for(int i=0; i<1E5; i++) {
			list.add(0, i);
		}
		long finishAddingToFrontOfExistingList = System.currentTimeMillis();
		
		System.out.println("Time taken to add to front of existing list: " + (finishAddingToFrontOfExistingList - startAddingToFrontOfExisingList) + " ms for " + type + "\n");
		
	}
	
	/* ArrayList
	 * ... manage arrays internally.
	 * 
	 * [0][1][2][3][4][5] .....
	 * 
	 * Traversing the list is fast,
	 * Getting a particular item is fast.
	 * 
	 * Adding items to the end of the list is fast,
	 * because a new larger array is created and everything is copied over.
	 * A new internal array only needs to be created internally on occasion.
	 * 
	 * Adding to the middle or beginning causes every element to be shifted.
	 * 
	 */
	
	/* LinkedList
	 * ... consist of elements where each element has a reference
	 * to the previous and next element.
	 * 
	 * [0] -> [1] -> [2]
	 *     <-     <-
	 *     
	 *	Traversing LinkedList is slower than ArrayList.
	 *	Retrieving at a specific index is slower than ArrayList
	 *
	 * Adding to the beginnign or middle is much faster than 
	 * ArrayList because all that needs to be changed are the pointers
	 *	in the LinkedList.
	 */
	
	// SUMMARY:
	//	If you want to add/remove items at the *end* of the list, use ArrayList
	//	If you want to add/remove items from anywhere else in the list, use LinkedList
}
