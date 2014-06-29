package com.venkman.collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* 
 * When using objects that you have created, you must
 * implement equals() and hashCode() to get expected behavior
 * from maps and sets.
 * 
 * See the example below.
 */

public class LearnToImplementSetAndMapMethodsForConsistentBehaviorOnYourOwnObjects {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);
		
		for(String key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("cat");
		
		System.out.println(set);
		
		// What if you want to add your own objects to a set or map?
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "Mike");
		Person p4 = new Person(1, "Sue");
		
		Map<Person, Integer> mapWithCustomObjects = new LinkedHashMap<Person, Integer>();
		mapWithCustomObjects.put(p1, 1);
		mapWithCustomObjects.put(p2, 2);
		mapWithCustomObjects.put(p3, 3);
		mapWithCustomObjects.put(p4, 1);
		
		for(Person key: mapWithCustomObjects.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		Set<Person> setWithCustomObjects = new LinkedHashSet<Person>();
		setWithCustomObjects.add(p1);
		setWithCustomObjects.add(p2);
		setWithCustomObjects.add(p3);
		setWithCustomObjects.add(p4);
		
		System.out.println(setWithCustomObjects);
		
	}
}

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "{ID is: " + id + " Name is: " + name + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

