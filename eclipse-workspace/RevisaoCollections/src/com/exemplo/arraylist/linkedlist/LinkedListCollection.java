package com.exemplo.arraylist.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {
	public static void main(String[] args) {
		LinkedList<String> linked = new LinkedList<String>();
		
		linked.add("Uma String");
		linked.add("Um texto");
		linked.add("Uma string");
		linked.add("Uma frase");
		
		Iterator<String> lk = linked.iterator();
		
		//loop
		while(lk.hasNext()) {
			System.out.println(lk.next());
		}
	}
}
