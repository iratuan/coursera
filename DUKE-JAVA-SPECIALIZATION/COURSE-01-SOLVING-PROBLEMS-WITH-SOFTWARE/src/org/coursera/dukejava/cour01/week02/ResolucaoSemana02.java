package org.coursera.dukejava.cour01.week02;

import java.util.ArrayList;
import java.util.List;

public class ResolucaoSemana02 {

	public int findStopCodon(String dna, int startIndex, String stopCodon) {
		int currIndex = dna.indexOf(stopCodon, startIndex + 3);
		while (currIndex != -1) {
			int diff = currIndex - startIndex;
			if (diff % 3 == 0) {
				return currIndex;
			} else {
				currIndex = dna.indexOf(stopCodon, currIndex + 1);
			}
		}

		return -1;
	}

	public String findGene(String dna, int where) {
		int startIndex = dna.indexOf("ATG", where);
		if (startIndex == -1 || where == -1) {
			return "";
		}

		int taaIndex = findStopCodon(dna, startIndex, "TAA");
		int tagIndex = findStopCodon(dna, startIndex, "TAG");
		int tgaIndex = findStopCodon(dna, startIndex, "TGA");

		int minIndex = 0;

		if (taaIndex == -1 || (tgaIndex != -1 && tgaIndex < taaIndex)) {
			minIndex = tgaIndex;
		} else {
			minIndex = taaIndex;
		}

		if (minIndex == -1 || (tagIndex != -1 && tagIndex < minIndex)) {
			minIndex = tagIndex;
		}

		if (minIndex == -1) {
			return "";
		}

		return dna.substring(startIndex, minIndex + 3);
	}

	public void howManyGenes60(String dna) {
		int startIndex = 0;
		int count = 0;

		while (true) {
			String gene = findGene(dna, startIndex);

			if (gene == "") {
				break;
			}

			startIndex = dna.indexOf(gene, startIndex) + gene.length();

			if (gene.length() > 60) {
				count++;
			}
		}

		System.out.println("How many genes > 60 are: " + count);
	}

	public void howManyGenes(String dna) {
		int startIndex = 0;
		int count = 0;

		while (true) {
			String gene = findGene(dna, startIndex);

			if (gene == "") {
				break;
			}

			startIndex = dna.indexOf(gene, startIndex) + gene.length();

			count++;
		}

		System.out.println("How many genes are: " + count);
	}

	public List<String> getAllGenes(String dna) {
		int startIndex = 0;
		List<String> genes = new ArrayList<String>();
		while (true) {
			String gene = findGene(dna, startIndex);

			if (gene == "") {
				break;
			}

			genes.add(gene);

			startIndex = dna.indexOf(gene, startIndex) + gene.length();

		}
		return genes;
	}

	public void countCTG(String dna) {
		int startIndex = 0;
		int count = 0;
		int index = dna.indexOf("CTG", startIndex);

		while (true) {
			if (index == -1 || count > dna.length()) {
				break;
			}

			count++;
			index = dna.indexOf("CTG", index + 3);
		}
		System.out.println("Qtd CTG is " + count);
	}

	public void processGenes(String dna) {
		String Longest = "";

		List<String> sr = getAllGenes(dna);

		for (String s : sr) {
			if (s.length() > Longest.length()) {
				Longest = s;
			}
		}
		System.out.println(Longest.length());
	}

	public float cgRatio(String dna) {

		dna = dna.toLowerCase();

		int dnaLen = dna.length();
		int gCount = countLetterInWord('g', dna);
		int cCount = countLetterInWord('c', dna);
		return (float) (gCount + cCount) / dnaLen;

	}

	public void countCgRatio(String dna) {

		int count = 0;

		for (String gene : getAllGenes(dna)) {			
			if (cgRatio(gene) > 0.35) {
				count++;
			}
		}
		System.out.println("Genes cgRatio > 0.35 is: " + count);
	}

	public static int countLetterInWord(char letter, String word) {

		int counter = 0;

		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == letter) {
				counter++;
			}
		}
		return counter;

	}

	public void getLongestGene(String dna) {

		int maxLen = 0;
		List<String> sr = getAllGenes(dna);
		String longestGene = "";

		for (String gene : sr) {

			int len = gene.length();

			if (len > maxLen) {
				maxLen = len;
				longestGene = gene;
			}

		}

		System.out.println("The longest gene is " + longestGene.length());
	}
}