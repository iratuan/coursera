package week04.exemplo01;

import week04.exemplo01.GeradorNome;

public class GeradorNomeBuilder {

	GeradorNome geradorNome;
	
	public GeradorNomeBuilder criarPessoa() {
		geradorNome = new GeradorNome();
		return this; 
	}

	public GeradorNome gerar() {
		return geradorNome;
	}

	public GeradorNomeBuilder criarMestre() {
		geradorNome = new GeradorMestre();
		return this;
	}

	public GeradorNomeBuilder criarDoutor() {
		geradorNome = new GeradorDoutor();
		return this;
	}
	
	public GeradorNomeBuilder excelentissimo() {
		inserirTratamento(new Excelentissimo());
		return this;
	}

	
	public GeradorNomeBuilder magnifico() {
		inserirTratamento(new Magnifico());
		return this;
	}
	
	private void inserirTratamento(Tratamento tratamento) {
		if(geradorNome.getTratamentoStrategy() instanceof NullTratamento) {
			geradorNome.setTratamento(tratamento);
		}else {
			geradorNome.setTratamento(new TratamentoComposite(geradorNome.getTratamentoStrategy(), tratamento));
		}
	}

	public GeradorNomeBuilder de(String local) {
		geradorNome = new GeradorNomeProxyLocal(geradorNome, local);
		return this;
	}


}
