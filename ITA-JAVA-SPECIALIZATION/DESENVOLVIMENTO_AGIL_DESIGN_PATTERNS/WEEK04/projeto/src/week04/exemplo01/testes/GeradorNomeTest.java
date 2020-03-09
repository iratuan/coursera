package week04.exemplo01.testes;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import week04.exemplo01.GeradorNome;
import week04.exemplo01.GeradorNomeBuilder;

class GeradorNomeTest {

	@Test
	void nomeBase() {
		GeradorNome gerador =  new GeradorNomeBuilder()
				.criarPessoa()
				.gerar();
		String nome = gerador.gerarNome("Iratuan");
		assertEquals("Iratuan", nome);
	}
	
	@Test
	void mestre() {
		GeradorNome gerador =  new GeradorNomeBuilder()
				.criarMestre()
				.gerar();
		String nome = gerador.gerarNome("Iratuan");
		assertEquals("Mestre Iratuan", nome);
	}
	
	@Test
	void doutor() {
		GeradorNome gerador =  new GeradorNomeBuilder()
				.criarDoutor()
				.gerar();
		String nome = gerador.gerarNome("Iratuan");
		assertEquals("Doutor Iratuan", nome);
	}
	
	@Test
	void excelentissimoDoutor() {
		GeradorNome gerador =  new GeradorNomeBuilder()
				.criarDoutor()
				.excelentissimo()
				.gerar();
		String nome = gerador.gerarNome("Iratuan");
		assertEquals("Excelentissimo Doutor Iratuan", nome);
	}
	
	@Test
	void magnificoMestre() {
		GeradorNome gerador =  new GeradorNomeBuilder()
				.criarMestre()
				.magnifico()
				.gerar();
		String nome = gerador.gerarNome("Iratuan");
		assertEquals("Magnifico Mestre Iratuan", nome);
	}
	
	@Test
	void excelentissimoMagnificoDoutor() {
		GeradorNome gerador =  new GeradorNomeBuilder()
				.criarDoutor()
				.excelentissimo()
				.magnifico()
				.gerar();
		String nome = gerador.gerarNome("Iratuan");
		assertEquals("Excelentissimo Magnifico Doutor Iratuan", nome);
	}
	
	@Test
	void criarPessoaDeFortaleza() {
		GeradorNome gerador =  new GeradorNomeBuilder()
				.criarPessoa()
				.de("Fortaleza")
				.gerar();
		String nome = gerador.gerarNome("Iratuan");
		assertEquals("Iratuan de Fortaleza", nome);
	}
	
	@Test
	void excelentissimoMagnificoDoutorDeFortalezaDeCaucaia() {
		GeradorNome gerador =  new GeradorNomeBuilder()
				.criarDoutor()
				.excelentissimo()
				.magnifico()
				.de("Fortaleza")
				.de("Caucaia")
				.gerar();
		String nome = gerador.gerarNome("Iratuan");
		assertEquals("Excelentissimo Magnifico Doutor Iratuan de Fortaleza de Caucaia", nome);
	}

}
