package b_intermediarios;

import java.util.Random;

/**
 * Crie um programa que simula o funcionamento de um caça níquel, da seguinte forma:
 * 
 * 1- Sorteie 3x um valor dentre as strings do vetor de valores
 * 2- Compare os valores sorteados e determine os pontos obtidos usando o
 * seguinte critério:
 * 
 * Caso hajam três valores diferentes: 0 pontos
 * Caso hajam dois valores iguais: 100 pontos
 * Caso hajam três valores iguais: 1000 pontos
 * Caso hajam três valores "7": 5000 pontos
 * 
 */
public class CacaNiquel {
	public static void main(String args[]) {
		String[] valores = {"abacaxi", "framboesa", "banana", "pera", "7"};
		
		Random random = new Random();
		
		int pontos = 0;
		
		String[] sorteados = new String[3];
		
		System.out.println("INICIANDO O CAÇA NÍQUEL");
		
		for(int i=0;i<3;i++) {
			sorteados[i] = valores[random.nextInt(5)];
			System.out.println(sorteados[i]);
		}
		
		if(sorteados[0].equals(sorteados[1].equals(sorteados[2]))) {
			if(sorteados[0].equals("7")) {
				System.out.println("5000");
			}else {
				System.out.println("1000");
			}
		}
		
		if(sorteados[0].equals(sorteados[1]) ||
		   sorteados[1].equals(sorteados[2]) ||
		   sorteados[0].equals(sorteados[2])) {
				System.out.println("100");

		}
		
	}
}
