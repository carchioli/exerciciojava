package b_intermediarios;

import java.nio.file.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Crie um programa que recebe um todo list e a escreve em um arquivo txt.
 * 
 * A cada iteração, o sistema deve pedir uma  única tarefa e exibir a possibilidade
 * de encerrar o programa.
 * 
 * Quando o usuário encerrar o programa, deve-se gerar o arquivo txt com as tarefas
 * que foram inseridas.
 *
 */
public class ListaTarefas {
	public static void main(String[] args) {
		
		Path path = Paths.get("teste.txt");
		String umaString = "Este é meu arquivo de teste";
		
		Scanner scanner = new Scanner(System.in);
		
		String tarefas = "";
		boolean parar = false;
	
		
		try {
			Files.write(path, umaString.getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		while(!parar) {
			
			System.out.println("Digite a tarefa");
			tarefas = tarefas + scanner.nextLine() + "\n";
			
			System.out.println("Fim? (S/N)");
			if(scanner.nextLine().equalsIgnoreCase("S")){
				parar = true;
			}
			
		}
		
		try {
			BufferedWriter writer = Files.newBufferedWriter(path);
			
			writer.write(tarefas);
			
			writer.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}		
		
		
	}
}
