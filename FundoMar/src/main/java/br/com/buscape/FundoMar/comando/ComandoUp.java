package br.com.buscape.FundoMar.comando;

import br.com.buscape.FundoMar.Submarino;

public class ComandoUp implements Navegador {
	
	Submarino submarino;
	
	public ComandoUp(Submarino submarino) {
		this.submarino = submarino;
	}

	@Override
	public void navegar() {
		submarino.adicionaZ();
	}

}
