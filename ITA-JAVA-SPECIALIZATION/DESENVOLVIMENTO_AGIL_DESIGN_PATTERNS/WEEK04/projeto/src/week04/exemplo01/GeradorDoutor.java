package week04.exemplo01;

import week04.exemplo01.GeradorNome;

public class GeradorDoutor extends GeradorNome {

	@Override
	protected String getTratamento() {
		return "Doutor ";
	}

}
