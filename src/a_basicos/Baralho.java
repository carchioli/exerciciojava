package a_basicos;

/**
 * Crie um programa que imprima todas as cartas do baralho.
 * 
 * Exemplo: 
 * 
 * Ás de Ouros
 * Ás de Espadas
 * Ás de Copas
 * Ás de Paus
 * Dois de Ouros
 * ...
 * 
 */

public class Baralho {

 public static void main(String args[]) {
	String[] naipe = new String[4];
	naipe[0] = "OUROS";  
	naipe[1] = "PAUS";
	naipe[2] = "COPAS";
	naipe[3] = "ESPADAS";

	String carta = "";

	for(int i=1;i<=13;i++) {

		for(int j=0;j<4;j++) {

			carta = "" + i + " de " +  naipe[j];

			if(i==1) {
				carta = "ÁS de " + naipe[j]; 
			}

			if(i==11) {
				carta = "Valete de " + naipe[j]; 
			}

			if(i==12) {
				carta = "Rainha de " + naipe[j]; 
			}

			if(i==13) {
				carta = "Rei de " + naipe[j]; 
			}
			
			System.out.println(carta);

		}
		
		System.out.println("===============================================================");
	}

 }
}
