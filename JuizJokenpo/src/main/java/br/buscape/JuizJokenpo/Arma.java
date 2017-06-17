package br.buscape.JuizJokenpo;

public enum Arma {

	PEDRA("TESOURA"),
	PAPEL("PEDRA"),
	TESOURA("PAPEL");
	
	private String ganha;
	
	private Arma(String arma)  {
		try {
			this.ganha=arma.toUpperCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Arma getArma(String arma) throws Exception{
		Arma valor;
		try {
			valor = Arma.valueOf(arma.toUpperCase());
		} catch (Exception e) {
			throw new Exception("Arma inválida. As armas válidas são: PEDRA, PAPEL e TESOURA");
		}
		return valor;
	}

	public Jogador disputa(Arma armaJogador2) throws Exception {
		if (this.equals(armaJogador2)){
			return Jogador.EMPATE;
		}
		if (getArma(ganha).equals(armaJogador2)){
			return Jogador.JOGADOR1;
		}
		return Jogador.JOGADOR2;
	}
}
