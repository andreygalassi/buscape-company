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
}
