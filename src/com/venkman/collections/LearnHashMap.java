package com.venkman.collections;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

	public static void main(String[] args) {
		
		// Maps store pairs of values where:
		//	One member of the pair is called the "key",
		//	The other is called the "value".
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");
		
		// Second 'put' of the same key will overwrite the first.
		map.put(6, "hello");
		
		String text = map.get(4);
		
		// Will print 'four'
		System.out.println(text);
		
		// Example of iterating through entryset of map
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
		
		// HashMap is not sorted in any way.
		// Iterating could happen in a different order each time.
		
		
	}
}
