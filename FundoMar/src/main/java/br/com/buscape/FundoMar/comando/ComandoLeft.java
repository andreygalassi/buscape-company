package br.com.buscape.FundoMar.comando;

import br.com.buscape.FundoMar.Submarino;

public class ComandoLeft implements Navegador {
	
	Submarino submarino;
	
	public ComandoLeft(Submarino submarino) {
		this.submarino = submarino;
	}

	@Override
	public void navegar() {
		submarino.esquerda();
	}

}
