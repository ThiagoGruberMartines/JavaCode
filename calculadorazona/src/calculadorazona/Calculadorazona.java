package calculadorazona;

import java.util.Scanner;

public class Calculadorazona {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Double num1 = 0.0, num2 = 0.0, altura = 0.0, peso = 0.0;
			int operador;
			
			
			System.out.println("Escolha uma operacao: ");
			System.out.println(2 + " Subtracao");
			System.out.println(3 + " Divisao");
			System.out.println(4 + " Multiplicacao");
			System.out.println(5 + " IMC");
			operador = scan.nextInt();
			
			switch(operador) {
			case 1: 
				System.out.println("Digite o primeiro numero:");
				num1 = scan.nextDouble();
				System.out.println("Digite o segundo numero:");
				num2 = scan.nextDouble();
				Double soma = Calculos.soma(num1, num2);
				System.out.println("O resultado da soma e: " + soma);
			break;
			
			case 2:
				System.out.println("Digite o primeiro numero:");
				num1 = scan.nextDouble();
				System.out.println("Digite o segundo numero:");
				num2 = scan.nextDouble();
				Double subtracao = Calculos.subtracao(num1, num2);
				System.out.println("O resultado da subtracao e: " + subtracao);
			break;
			case 3: 
				System.out.println("Digite o primeiro numero:");
				num1 = scan.nextDouble();
				System.out.println("Digite o segundo numero:");
				num2 = scan.nextDouble();
				Double divisao = Calculos.divisao(num1, num2);
				System.out.println("O resultado da divisao e: " + divisao);
			break;
			case 4: 
				System.out.println("Digite o primeiro numero:");
				num1 = scan.nextDouble();
				System.out.println("Digite o segundo numero:");
				num2 = scan.nextDouble();
				Double multiplicacao = Calculos.multiplicacao(num1, num2);
				System.out.println("O resultado da multiplicacao e: " + multiplicacao);
			break;
			case 5:
				System.out.println("Digite sua altura:");
				altura = scan.nextDouble();
				System.out.println("Digite seu peso:");
				peso = scan.nextDouble();
				Double imc = Calculos.imc(altura, peso);
				System.out.println("Seu IMC e: " + imc);
			break;
			default: 
				System.out.println("O operador " + operador + " e invalido");
}
		}
}
}
