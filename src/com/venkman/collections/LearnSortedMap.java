package com.venkman.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnSortedMap {

	public static void main(String[] args) {
		
		// Does not store entries in order.
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		/* LinkedHashMap
		 *	Maintains "put" or "insertion" order by using a linked list to store entries.
		 * 	More performant than TreeMap.
		 * 	Not thread-safe / synchronized by default.
		 * 
		 *	Use LinkedHashMap to make a copy of HashMap that preserves order:
		 *	Map copy = new LinkedHashMap(existingHashMap);
		 *
		 *	If you are going to have multiple threads accessing this map
		 *	and maintaining order is important, best do something like this:
		 *	Map m = Collections.synchronizedMap(new LinkedHashMap(...));
		 */		
		Map linkedHashMap = new LinkedHashMap<Integer, String>();
		
		/* TreeMap
		 *	Sorted by natural ordering of its keys, or
		 *	by a comparator provided at map creation time.
		 *
		 *	Provides guaranteed log(n) time cost for:
		 *		containsKey
		 *		get
		 *		put
		 *		remove
		 *
		 *	If you are going to have multiple threads accessing this map
		 *	and maintaining order is important, best do something like this:
		 *	Map m = Collections.synchronizedMap(new TreeMap(...));
		 * 
		 */
		Map treeMap = new TreeMap<Integer, String>();
		
		testMap(hashMap);
		testMap(linkedHashMap);
		testMap(treeMap);
		
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		
		// Example of iterating through keyset of the map.
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}
}
