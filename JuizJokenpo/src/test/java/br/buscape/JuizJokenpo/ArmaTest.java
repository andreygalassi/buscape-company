package br.buscape.JuizJokenpo;

import org.junit.Assert;
import org.junit.Test;


public class ArmaTest {

	@Test
	public void deveRetornarPedra() throws Exception{
		Assert.assertEquals(Arma.PEDRA, Arma.getArma("pedra"));
	}
	@Test
	public void deveRetornarPapel() throws Exception{
		Assert.assertEquals(Arma.PAPEL, Arma.getArma("papel"));
	}
	@Test
	public void deveRetornarTesoura() throws Exception{
		Assert.assertEquals(Arma.TESOURA, Arma.getArma("TESOURA"));
	}
	
	@Test(expected=Exception.class)
	public void deveRetornaExcessaoQuandoNaoAcharArma() throws Exception{
		Arma.getArma("qualquer coisa");
	}

	@Test
	public void deveRetornaJogador1() throws Exception{
		Assert.assertEquals(Jogador.JOGADOR1, Arma.PEDRA.disputa(Arma.TESOURA));
	}
	
	@Test
	public void deveRetornaJogador2() throws Exception{
		Assert.assertEquals(Jogador.JOGADOR2, Arma.TESOURA.disputa(Arma.PEDRA));
	}
	
	@Test
	public void deveRetornaEmpate() throws Exception{
		Assert.assertEquals(Jogador.EMPATE, Arma.PAPEL.disputa(Arma.PAPEL));
	}
	
}
