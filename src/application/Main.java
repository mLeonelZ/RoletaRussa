package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Arma arma = new Arma();
		
		System.out.println("Bem vindo ao aplicativo da Roleta Russa");
		System.out.println("Boa sorte para sair vivo!");
		
		System.out.println();
		System.out.println("Informe a quantidade de munições que serão carregadas:");
		arma.setMunicoes(sc.nextInt());
		
		System.out.println("Informe em qual posicao irá inserir a munição:");

		for(int i = 0; i < arma.getMunicoes(); i++) {			
			arma.setPosicao(sc.nextInt() - 1);
			arma.municiar();
		}
		
		System.out.println();
		System.out.println("Hora de girar !!!");
		arma.girarTambor();
		System.out.println();
		System.out.println("Tambor girado, e pronto para atirar!");
		System.out.println("Para acionar o gatilho digite 1");
		int resposta = sc.nextInt();
		
		if(resposta == 1) {
			arma.atirar();
		} else {
			System.out.println("C.A.G.Ã.O, não teve coragem kkkkkkkkkkk");
		}
		
		if(arma.resultadoDisparo()) {
			int resposta2;
			do {
				System.out.println("Deseja continuar? (1-sim | 2-não)");				
				resposta2 = sc.nextInt();
				if(resposta2 == 1) {
				arma.continuar();
				} 
			} while(resposta2 == 1);
			
		}
		
		//teste git
				
		sc.close();
	}

}
