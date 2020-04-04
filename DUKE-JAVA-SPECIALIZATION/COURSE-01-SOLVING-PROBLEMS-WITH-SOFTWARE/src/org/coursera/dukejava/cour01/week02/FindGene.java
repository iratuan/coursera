package org.coursera.dukejava.cour01.week02;

import java.util.ArrayList;
import java.util.List;

public class FindGene {

	private List<String> genes = new ArrayList<>();

	String dna;
	int index;
	int fin;

	public List<String> getGenes(String dnaInput) {
		dna = dnaInput.toUpperCase();
		addGene();
		return genes;
	}

	private void addGene() {
		int count = 0;
		String partialGene = null;
		while (count < dna.length()) {
			index = dna.indexOf("ATG");
			fin = dna.indexOf("AAT") + index;
			if (index >= 0 && fin >= 0 && fin < dna.length()) {
				partialGene = dna.substring(index, fin + 3);
				if (partialGene.length() % 3 == 0) {
					genes.add(partialGene);
				}
			}
			index = fin + 3;
			dna = dna.substring(fin + 3);
			count++;
		}

	}

	public float calcCGRation(String dna) {
		float count = 0f;
		float dnaSize = dna.length();
		for (int i = 0; i < dna.length(); i++) {
			if (dna.toUpperCase().charAt(i) == 'G' || dna.toUpperCase().charAt(i) == 'C')
				count++;
		}
		return count / dnaSize;
	}

	public int countCondon(String dna) {
		String findStr = "CTG";
		int lastIndex = 0;
		int r = 0;

		while (lastIndex != -1) {

			lastIndex = this.dna.toUpperCase().indexOf(findStr, lastIndex);

			if (lastIndex != -1) {
				r++;
				lastIndex++;
			}
		}

		return r;
	}

}
