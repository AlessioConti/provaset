package it.prova.provaset.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {

		Set<String> colorsSet = new HashSet<String>();

		colorsSet.add("Red");
		colorsSet.add("Yellow");
		colorsSet.add("Blue");
		colorsSet.add("Green");

		System.out.println("Stampa del contenuto:");
		System.out.println(colorsSet);

		Set<String> treeSet = new TreeSet<String>(colorsSet);
		System.out.println("Stampa del contenuto ordinato");
		System.out.println(treeSet);

		// Stampa dei risultati usando iteratori

		Iterator<String> iter = colorsSet.iterator();
		while (iter.hasNext())
			System.out.println(iter.next() + ' ');

		// Stampa dei risultati usando un for each
		for (String stringInput : colorsSet)
			System.out.println(stringInput + ' ');

	}

}
