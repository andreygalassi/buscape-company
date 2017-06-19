package br.com.buscape.FundoMar;

import org.junit.Assert;
import org.junit.Test;

import br.com.buscape.FundoMar.comando.Direcao;

public class SubmarinoTest {

	@Test
	public void deveRetornarPosicaoDoSubmarino(){
		
		Submarino submarino = new Submarino();
		String posicao = submarino.comando("LMRDDMMUU");
		
		Assert.assertEquals("-1 2 0 NORTE", posicao);
	}
	@Test
	public void deveRetornarPosicaoDoSubmarino2(){
		
		Submarino submarino = new Submarino();
		String posicao = submarino.comando("RMMLMMMDDLL");
		
		Assert.assertEquals("2 3 -2 SUL", posicao);
	}
	@Test
	public void deveRetornarPosicaoDoSubmarinoViradoParaLeste(){
		
		Submarino submarino = new Submarino();
		String posicao = submarino.comando("R");
		
		Assert.assertEquals("0 0 0 LESTE", posicao);
	}

	@Test
	public void deveRetornarNorteApos2VoltasHorarias(){
		Submarino submarino = new Submarino();
		
		Assert.assertEquals(Direcao.NORTE, submarino.direcaoAtual());
		submarino.direita();
		Assert.assertEquals(Direcao.LESTE, submarino.direcaoAtual());
		submarino.direita();
		Assert.assertEquals(Direcao.SUL, submarino.direcaoAtual());
		submarino.direita();
		Assert.assertEquals(Direcao.OESTE, submarino.direcaoAtual());
		submarino.direita();
		Assert.assertEquals(Direcao.NORTE, submarino.direcaoAtual());
		submarino.direita();
		Assert.assertEquals(Direcao.LESTE, submarino.direcaoAtual());
		submarino.direita();
		Assert.assertEquals(Direcao.SUL, submarino.direcaoAtual());
		submarino.direita();
		Assert.assertEquals(Direcao.OESTE, submarino.direcaoAtual());
		submarino.direita();
		Assert.assertEquals(Direcao.NORTE, submarino.direcaoAtual());
		
	}

	@Test
	public void deveRetornarNorteApos2VoltasAntiHorarias(){
		Submarino submarino = new Submarino();
		
		Assert.assertEquals(Direcao.NORTE, submarino.direcaoAtual());
		submarino.esquerda();
		Assert.assertEquals(Direcao.OESTE, submarino.direcaoAtual());
		submarino.esquerda();
		Assert.assertEquals(Direcao.SUL, submarino.direcaoAtual());
		submarino.esquerda();
		Assert.assertEquals(Direcao.LESTE, submarino.direcaoAtual());
		submarino.esquerda();
		Assert.assertEquals(Direcao.NORTE, submarino.direcaoAtual());
		submarino.esquerda();
		Assert.assertEquals(Direcao.OESTE, submarino.direcaoAtual());
		submarino.esquerda();
		Assert.assertEquals(Direcao.SUL, submarino.direcaoAtual());
		submarino.esquerda();
		Assert.assertEquals(Direcao.LESTE, submarino.direcaoAtual());
		submarino.esquerda();
		Assert.assertEquals(Direcao.NORTE, submarino.direcaoAtual());
		
	}
}
