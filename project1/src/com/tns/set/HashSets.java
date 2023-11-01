package com.tns.set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class HashSets {
	public static void operations(){
		Set<Integer> newset = new HashSet<Integer>();
		//adding elements
		newset.add(12);
		newset.addAll(Arrays.asList(new Integer[] {1,4,5,3,7}));
		//print set
		System.out.println("the elements of set are"+newset);
		//print size of set
		System.out.println("the size of set is"+newset.size());
		//create a new set
		Set<Integer>oldset=new HashSet<Integer>();
		//adding elements
		oldset.addAll(Arrays.asList(new Integer[] {2,3,4,5,6,7}));
		//print set
				System.out.println("the elements of  new set are"+oldset);
		//check element in set
		System.out.println("the contains method of set is"+oldset.contains(4));
		System.out.println("the to string of set is"+oldset.toString());
		//Intersection operation
		Set<Integer>set_intersection=new HashSet<Integer>(newset);
		set_intersection.retainAll(oldset);
		System.out.println("the intersection of two sets are");
		System.out.println(set_intersection);
		//union of two sets
				Set<Integer>union_set=new HashSet<Integer>(newset);
				union_set.addAll(oldset);
				System.out.println("the union of two sets are");
				System.out.println(union_set);
				//difference of two sets
				Set<Integer>diffe_set=new HashSet<Integer>(newset);
				set_intersection.removeAll(oldset);
				System.out.println("the difference of two sets are");
				System.out.println(diffe_set);
				
				
			}

}
