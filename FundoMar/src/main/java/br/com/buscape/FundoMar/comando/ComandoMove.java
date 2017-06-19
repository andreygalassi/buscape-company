package br.com.buscape.FundoMar.comando;

import br.com.buscape.FundoMar.Submarino;

public class ComandoMove implements Navegador {
	
	Submarino submarino;
	
	public ComandoMove(Submarino submarino) {
		this.submarino = submarino;
	}

	@Override
	public void navegar() {
		switch (submarino.direcaoAtual()) {
		case NORTE:
			submarino.adicionaY();
			break;
		case SUL:
			submarino.removeY();
			break;
		case LESTE:
			submarino.adicionaX();
			break;
		case OESTE:
			submarino.removeX();
			break;

		default:
			break;
		}
	}

}
