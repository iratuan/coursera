package org.coursera.dukejava.cour01.week02.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.coursera.dukejava.cour01.week02.FindGene;
import org.coursera.dukejava.cour01.week02.StringDNABuilder;
import org.junit.jupiter.api.Test;

class TestGenes {
	String pathSystem ="//Volumes//Dados//Estudos//Coursera//DUKE-JAVA-SPECIALIZATION//COURSE-01-SOLVING-PROBLEMS-WITH-SOFTWARE/data/";
	String path = pathSystem + "brca1.fa";

	
	String dnaString = StringDNABuilder.stringDNA(path);
	FindGene fg = new FindGene();
	
	
	@Test
	void testFindAllGenes() {
		List<String> gene = fg.getGenes(dnaString);
		assertTrue(gene.size() > 0);
	}

}
