package com.venkman.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSets {

	public static void main(String[] args) {
		
		/* Set
		 * 	An interface in the java collections framework.
		 * 	Stores only unique elements.
		 * 	Sets cannot contain themselves.
		 * 	Sets are optimized to find its items quickly.
		 * 
		 * 	Be careful using mutable objects in sets!
		 * 	Behavior is not specified in the following situation:
		 * 		Given a set containing two objects:
		 * 			[Vehicle airplane, Vehicle car]
		 * 		When car changes in a way that it is now equals to airplane,
		 * 		Strange things can happen, bad things *will* happen.
		 */
		
		/* HashSet
		 * 	Does not guarantee any type of order.
		 * 	null is permitted.
		 * 	Offers constant performance for add, remove, contains, and size.
		 * 	If iteration performance is important, be careful not to set initial size too high.
		 * 	
		 */
		
		Set<String> set1 = new HashSet<String>();
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		// Adding duplicate items does nothing.
		set1.add("mouse");

		// Order is not guaranteed in any way.
		System.out.println(set1);
		
		
		/* LinkedHashSet
		 * 	Remembers the order you added items in by maintaining a linkedlist.
		 * 	Insertion order is not affected if an element is re-inserted.
		 * 	More performant than TreeSet
		 * 	null is permitted.
		 * 	Iteration times are unaffected by capacity.
		 * 
		 */
		
		Set<String> set2 = new LinkedHashSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("mouse");
		set2.add("snake");
		set2.add("bear");
		
		// Will print in inserted order.
		System.out.println(set2);
		
		/* TreeSet
		 * 	Stores items in 'natural' order.
		 * 	Offers log(n) perfmormance for add, remove, and contains.
		 * 
		 */
		
		Set<String> set3 = new TreeSet<String>();
		
		set3.add("dog");
		set3.add("cat");
		set3.add("mouse");
		set3.add("snake");
		set3.add("bear");
		
		// Will print in alphabetical order.
		System.out.println(set3);
		
		// Iteration
		for(String element: set1) {
			System.out.println(element);
		}
		
		// Does this set have my item?
		boolean itDoesContainABear = set1.contains("bear");
		if(itDoesContainABear) {
			System.out.println("Set 1 contains a bear.");
		}
		
		// Is the set empty?
		boolean set2IsNotEmpty = set2.isEmpty();
		if(set2IsNotEmpty) {
			System.out.println("Set 2 is not empty.");
		}
		
		// 'Intersection'
		Set<String> set4 = new TreeSet<String>();
		
		set4.add("dog");
		set4.add("cat");
		set4.add("giraffe");
		set4.add("monkey");
		set4.add("ant");
		
		// Create a copy of set1
		Set<String> intersection = new HashSet<String>(set1);
		
		// Which elements are in intersection and set2 ?
		intersection.retainAll(set4);
		System.out.println("Intersection of set1 and set4: " + intersection);
		
		// 'Difference'
		Set<String> difference = new HashSet<String>(set1);
		difference.removeAll(set4);
		System.out.println("Differences between set1 and set4: " + difference);
		
		}
}

