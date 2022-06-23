package com.exemplo.arraylist.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {
		Vector<String> vetorzinho = new Vector<String>();
		
		vetorzinho.add("Sou um vetorzinho 1");
		vetorzinho.add("Sou um vetorzinho 2");
		vetorzinho.add("Sou um vetorzinho 3");
		vetorzinho.add("Sou um vetorzinho 4");
		
		Iterator<String> vc = vetorzinho.iterator();
		
		//loop
		while(vc.hasNext()) {
			System.out.println(vc.next());
		}

	}

}
