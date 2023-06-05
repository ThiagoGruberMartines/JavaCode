package estudo02;

import estudo02.Metodos;
import java.util.Scanner;

public class MetodoMain {
	public static void main(String[] args) {
		String nome;
		int idade;
		Double num1, num2;
		String desejo;
		Double resultado;
		Scanner scan = new Scanner(System.in);
		Metodos obj = new Metodos();
		
		
		System.out.println("Oque voce deseja?");
		System.out.println("1 - Retornar um nome e uma idade");
		System.out.println("2 - Realizar uma soma");
		System.out.println("3 - Realizar uma subtracao");
		System.out.println("4 - Realizar uma multiplicacao");
		System.out.println("5 - Realizar uma divisao");
		desejo = scan.next();
		
		switch(desejo) {
		case "1":
			System.out.println("Digite um nome");
		case "2":
			System.out.println("Digite um numero:");
			num1 = scan.nextDouble();
			System.out.println("Digite um segundo numero");
			num2 = scan.nextDouble();
			resultado = obj.calculaSoma(num1, num2);
			System.out.println("Resultado: " + resultado);
			break;
		}
	}
}
