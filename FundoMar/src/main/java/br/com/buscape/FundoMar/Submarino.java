package br.com.buscape.FundoMar;

import java.util.ArrayList;
import java.util.List;

import br.com.buscape.FundoMar.comando.Direcao;

public class Submarino {
	
	private Integer x,y,z=0;
	private Direcao direcao = Direcao.NORTE;
	
	public String comando(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Direcao direcaoAtual;
	private int posicao;
	private List<Direcao> fila;
	
	private void montarLista() {
		if (fila==null){
			fila = new ArrayList<>();
			fila.add(Direcao.NORTE);
			fila.add(Direcao.LESTE);
			fila.add(Direcao.SUL);
			fila.add(Direcao.OESTE);
			direcaoAtual = Direcao.NORTE;
			posicao=0;
		}
	}
	
	public Direcao direcaoAtual(){
		montarLista();
		return direcaoAtual;
	}
	
	public Direcao esquerda(){
		montarLista();
		if (posicao-1<0){
			posicao = Direcao.values().length;
		}
		direcaoAtual = fila.get(--posicao);
		return direcaoAtual;
	}
	
	public Direcao direita(){
		montarLista();
		if (posicao+1>Direcao.values().length-1){
			posicao = -1;
		}
		direcaoAtual = fila.get(++posicao);
		return direcaoAtual;
	}

	public void adicionaX(){
		++x;
	}

	public void adicionaY(){
		++y;
	}

	public void adicionaZ(){
		++z;
	}

	public void removeX(){
		--x;
	}

	public void removeY(){
		--y;
	}

	public void removeZ(){
		--z;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

}
