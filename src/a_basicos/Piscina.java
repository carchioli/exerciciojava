package a_basicos;

import java.util.Scanner;

/**
 * Crie um programa que recebe as três dimensões de uma piscina
 * (largura, comprimento, profundidade) e retorne a sua capacidade
 * em litros.
 */
public class Piscina {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int volume = 0;
		
		System.out.println("Digite o valor da largura de piscina em metros");
		int largura = scanner.nextInt();
		
		System.out.println("Digite o valor da larguda de comprimento em metros");
		int comprimento = scanner.nextInt();
		
		System.out.println("Digite o valor da profundidade de piscina em metros");
		int profundidade = scanner.nextInt();
		
		volume = (comprimento * largura * profundidade);
		
		System.out.println("Volume da piscina: " + volume*1000 + " litros");
		
		scanner.close();
	}
}
