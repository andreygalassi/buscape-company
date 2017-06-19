package br.com.buscape.FundoMar;

import org.junit.Assert;
import org.junit.Test;

public class SubmarinoTest {

	@Test
	public void deveRetornarPosicao(){
		
		Submarino submarino = new Submarino();
		String posicao = submarino.comando("LMRDDMMUU");
		
		Assert.assertEquals("-1 2 0 NORTE", posicao);
	}
}
