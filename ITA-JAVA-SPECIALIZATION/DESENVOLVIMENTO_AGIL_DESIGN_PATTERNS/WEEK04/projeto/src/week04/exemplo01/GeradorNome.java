package week04.exemplo01;

public class GeradorNome {
	
	private Tratamento tratamento = new NullTratamento();
	
	

	public void setTratamento(Tratamento tratamento) {
		this.tratamento = tratamento;
	}

	public String gerarNome(String nome) {
		return tratamento.tratar() + getTratamento() + nome;

	}
	
	public Tratamento getTratamentoStrategy() {
		return tratamento;

	}

	protected String getTratamento() {
		return "";
	}

}
