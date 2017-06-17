package br.buscape.JuizJokenpo;

public enum Arma {

	PEDRA,
	PAPEL,
	TESOURA;
	
	public static Arma getArma(String arma) throws Exception{
		Arma valor;
		try {
			valor = Arma.valueOf(arma.toUpperCase());
		} catch (Exception e) {
			throw new Exception("Arma inválida. As armas válidas são: PEDRA, PAPEL e TESOURA");
		}
		return valor;
	}
}
