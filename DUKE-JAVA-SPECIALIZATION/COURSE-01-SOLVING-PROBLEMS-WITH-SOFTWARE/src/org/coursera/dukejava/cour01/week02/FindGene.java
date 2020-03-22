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
		index = dna.indexOf("ATG");
		fin = dna.indexOf("AAT");
		while(index != -1 && fin != -1) {			
			String gene = dna.substring(index, fin + 3);
			if(gene.length() % 3 == 0) {
				genes.add(gene);	
			}
			index = dna.indexOf("ATG", fin + 3);
			fin = dna.indexOf("AAT", index);
		}
	}

}
