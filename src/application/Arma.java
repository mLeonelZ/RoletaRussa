package application;

import java.util.Random;

public class Arma {
	private int municoes;
	private int [] posicoes = new int [] {0,0,0,0,0,0};
	private int posicao;
	private int posicaoEngatilhado;
	
	public Arma(){
	}
	
	public Arma(int municoes, int posicao) {
		this.municoes = municoes;
		this.posicao = posicao;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public void setMunicoes(int municoes) {
		
		if(municoes <= 0) {
			System.out.println("A quantidade não pode ser = a 0 ou menor!");
		} else if( municoes == 6 ) {
			System.out.println("100% de que você vai morre bixo");
			this.municoes = municoes;
		} else if (municoes > 6) {			
			System.out.println("Não é possivel inserir " + municoes + " munições!");
		} else {			
			this.municoes = municoes;
		}
	
	}
	
	public int getMunicoes() {
		return municoes;
	}
	
	// METODOS:
	
	public void municiar(){		
		posicoes[getPosicao()] = 1;
	}
	
	public void girarTambor() {
		Random girar = new Random();
		posicaoEngatilhado = girar.nextInt(0,5);
	}
	
	public boolean atirar(){
		if(posicoes[posicaoEngatilhado] == 1) {
			System.out.println("Infelizmente você foi de vasco, meu amigo");
			return false;
		} else {
			System.out.println("Por incrivel que pareça você está salvo.");
			return true;
		}
	}
	
	public boolean resultadoDisparo(){
		boolean vivo = atirar();
		
		if(vivo) {
			return true;
		}else {
			return false;
		}	
	}
	
	public void continuar() {
		if(posicaoEngatilhado < 5) {
			posicaoEngatilhado++;
			atirar();
		} else if(posicaoEngatilhado == 5) {
			posicaoEngatilhado = 0;
			atirar();
		}
	}
	

	
	
}
