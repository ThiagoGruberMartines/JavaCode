package FirstProjectInJava;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double a,b;
		
		System.out.println("Digite um numero");
		a = scan.nextDouble();
		System.out.println("Digite um segundo numero");
		b = scan.nextDouble();
		
		Double soma = soma(a,b);
		Double subtracao = subtracao(a,b);
		Double multiplicacao = multiplicacao(a,b);
		Double divisao = divisao(a,b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + subtracao);
		System.out.println("Multiplicacao: " + multiplicacao);
		System.out.println("Divisao: " + divisao);
	}
	
	
	// MÉTODOS DA CALCULADORA
	
	public static Double soma (Double a, Double b) {
		return a + b ;
	}
	public static Double subtracao (Double a, Double b) {
		return a - b ;
	}
	public static Double multiplicacao (Double a, Double b) {
		return a * b ;
	}
	public static Double divisao (Double a, Double b) {
		return a / b ;
	}
	
}
