package br.com.buscape.FundoMar.comando;

import br.com.buscape.FundoMar.Submarino;

public class ComandoRight implements Navegador {
	
	Submarino submarino;
	
	public ComandoRight(Submarino submarino) {
		this.submarino = submarino;
	}

	@Override
	public void navegar() {
		submarino.direita();
	}

}
