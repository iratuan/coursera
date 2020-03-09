package week04.exemplo01;

public class GeradorNomeProxyLocal extends GeradorNome {
	
	private GeradorNome gerador;
	private String local;
	
	public GeradorNomeProxyLocal(GeradorNome gerador, String local) {
		this.gerador = gerador;
		this.local = local;
	}

	public void setTratamento(Tratamento tratamento) {
		gerador.setTratamento(tratamento);
	}

	public String gerarNome(String nome) {
		return gerador.gerarNome(nome) + " de " + local ;
	}

	public Tratamento getTratamentoStrategy() {
		return gerador.getTratamentoStrategy();
	}
	
	@Override
	public String getTratamento() {
		return gerador.getTratamento();
		
	}
	
	
}
