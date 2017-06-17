package br.buscape.JuizJokenpo;

import org.junit.Assert;
import org.junit.Test;

public class JuizTeste {
	
	@Test
	public void deveRetornarJogador1DisputaPedraContraTesoura() throws Exception{
		Juiz juiz = new Juiz();
		Assert.assertEquals(Jogador.JOGADOR1, juiz.joKenPo(Arma.PEDRA,Arma.TESOURA));
	}

	@Test
	public void deveRetornarJogador1DisputaPapelContraPedra() throws Exception{
		Juiz juiz = new Juiz();
		Assert.assertEquals(Jogador.JOGADOR1, juiz.joKenPo(Arma.PAPEL,Arma.PEDRA));
	}

	@Test
	public void deveRetornarJogador1DisputaTesouraContraPapel() throws Exception{
		Juiz juiz = new Juiz();
		Assert.assertEquals(Jogador.JOGADOR1, juiz.joKenPo(Arma.TESOURA,Arma.PAPEL));
	}

	@Test
	public void deveRetornarJogador2DisputaPedraContraPapel() throws Exception{
		Juiz juiz = new Juiz();
		Assert.assertEquals(Jogador.JOGADOR2, juiz.joKenPo(Arma.PEDRA,Arma.PAPEL));
	}

	@Test
	public void deveRetornarJogador2DisputaPapelContraTesoura() throws Exception{
		Juiz juiz = new Juiz();
		Assert.assertEquals(Jogador.JOGADOR2, juiz.joKenPo(Arma.PAPEL,Arma.TESOURA));
	}

	@Test
	public void deveRetornarJogador2DisputaTesouraContraPedra() throws Exception{
		Juiz juiz = new Juiz();
		Assert.assertEquals(Jogador.JOGADOR2, juiz.joKenPo(Arma.TESOURA,Arma.PEDRA));
	}
}
