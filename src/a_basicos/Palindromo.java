package a_basicos;

import java.util.Scanner;

/**
 * Crie um programa que recebe uma palavra do terminal e determina
 * se ela é um palíndromo.
 * 
 * Exs: 
 * 
 * input: ovo
 * output: A palavra ovo é um palíndromo
 * 
 * input: jose
 * output: A palavra jose não é um palíndromo 
 */
public class Palindromo {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		String palavra = "";
		String palindromo = "";
		
		System.out.println("Digite uma palavra");
		palavra = scanner.nextLine();
		
		for(int i=0;i<palavra.length();i++) {
			palindromo = palindromo + palavra.charAt(palavra.length()-1 -i);
		}
		
		if(palavra.equals(palindromo)) {
			System.out.println("Palindromo");
		}else {
			System.out.println("Não Palindromo");
		}		
		
	}
}
