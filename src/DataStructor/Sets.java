package DataStructor;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		Set<String> animals = new TreeSet<String>();
		
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");
		
		System.out.println(animals.size() + " " + animals);
		
		animals.add("dog");
		animals.add("pig");
		animals.add("goose");
		
		System.out.println(animals.size() + " " + animals);

		
		Set<String> farmAnimals = new HashSet<String>();
		
		farmAnimals.add("Chicken");
		farmAnimals.add("pig");
		farmAnimals.add("cow");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		
		//Ugyanolyanok
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println(intersectionSet);
		
		intersectionSet.retainAll(farmAnimals);
		
		System.out.println("The intersection is: " + intersectionSet);
		
		//UNion
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		
		unionSet.addAll(animals);
		
		System.out.println("The Union is: " + unionSet);
		
		//Difference
		Set<String> differenceSet = new TreeSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The Difference: " + differenceSet);
		
		//System.out.println(animals.size() + " " + animals);

	}

}
