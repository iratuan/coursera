package org.coursera.dukejava.cour01.week02.tests;

import org.coursera.dukejava.cour01.week02.ResolucaoSemana02;
import org.coursera.dukejava.cour01.week02.StringDNABuilder;
import org.junit.jupiter.api.Test;

class ResolucaoWeek02Test {
	String pathSystem = "C:\\Coursera\\coursera\\DUKE-JAVA-SPECIALIZATION\\COURSE-01-SOLVING-PROBLEMS-WITH-SOFTWARE\\data\\";
	String path = pathSystem + "GRch38dnapart.fa";
	String dna = StringDNABuilder.stringDNA(path).toUpperCase();
	
	ResolucaoSemana02 res = new ResolucaoSemana02();
	@Test
	void test() {
		res.howManyGenes(dna); //Q3 -> 69
		res.howManyGenes60(dna); // Q4 -> 23
		res.countCgRatio(dna); // Q5 -> 40
		res.countCTG(dna); // Q6 -> 224
		res.getLongestGene(dna); //Q7 -> 489 
	}
}

