package br.com.buscape.FundoMar.comando;

import br.com.buscape.FundoMar.Submarino;

public class ComandoDown implements Navegador {
	
	Submarino submarino;
	
	public ComandoDown(Submarino submarino) {
		this.submarino = submarino;
	}

	@Override
	public void navegar() {
		submarino.removeZ();
	}

}
