package br.com.buscape.FundoMar;

import java.util.ArrayList;
import java.util.List;

import br.com.buscape.FundoMar.comando.ComandoDown;
import br.com.buscape.FundoMar.comando.ComandoLeft;
import br.com.buscape.FundoMar.comando.ComandoMove;
import br.com.buscape.FundoMar.comando.ComandoRight;
import br.com.buscape.FundoMar.comando.ComandoUp;
import br.com.buscape.FundoMar.comando.Direcao;
import br.com.buscape.FundoMar.comando.Navegador;

public class Submarino {
	
	private Integer x=0,y=0,z=0;
	private List<Navegador> comandos;
	private Direcao direcaoAtual = Direcao.NORTE;
	private int posicao;
	private List<Direcao> fila;
	
	public String comando(String comando) {
		if (comando==null) comando="";
		comandos = new ArrayList<>();
		converteComandos(comando);
		for (Navegador navegador : comandos) {
			navegador.navegar();
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(x).append(" ");
		sb.append(y).append(" ");
		sb.append(z).append(" ");
		sb.append(direcaoAtual.name());

		return sb.toString();
	}

	private void converteComandos(String string) {
		for (Character c : string.toCharArray()) {
			switch (c) {
			case 'L':
				comandos.add(new ComandoLeft(this));
				break;
			case 'R':
				comandos.add(new ComandoRight(this));
				break;
			case 'U':
				comandos.add(new ComandoUp(this));
				break;
			case 'D':
				comandos.add(new ComandoDown(this));
				break;
			case 'M':
				comandos.add(new ComandoMove(this));
				break;
			default:
				break;
			}
		}
	}
	
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
		if (z!=0)
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

}
