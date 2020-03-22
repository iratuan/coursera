package org.coursera.dukejava.cour01.week02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringDNABuilder {
	public static String stringDNA(String path) {
		File file = new File(path);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		String dna = "";
	
		while (sc.hasNextLine()) {
			dna += sc.nextLine().toString();
		}
		return dna;
	}
}
