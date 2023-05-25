package estudo01;

import java.util.Scanner;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		// Atributos
		int idade;
		String nome;
		
		// Criação de um objeto Scanner
		Scanner scan = new Scanner(System.in);
		
		
		// Programa
		System.out.println("Digite o seu nome: ");
		nome = scan.next();
		System.out.println("Digite a sua idade: ");
		idade = scan.nextInt();
		
		// Criando uma instância da classe PrimeiroPrograma
		PrimeiroPrograma obj = new PrimeiroPrograma();
		
		// Chamando o método Pessoa usando a instância criada
		obj.Pessoa(nome, idade);
		
		// Fechando o scanner
		scan.close();
	}
	
	public void Pessoa(String nome, int idade) {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}

