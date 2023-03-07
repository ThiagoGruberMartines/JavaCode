package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número da tabuada desejada: ");
		multiplica(scan.nextInt());
	}
		
	
	
	
	
		public static void multiplica(Integer num) {
			Integer multiplicando = 1;
			while(multiplicando <= 10) {
				System.out.println(num + "x" + multiplicando + " = " + num * multiplicando);
				multiplicando = multiplicando + 1;
			}
		}	
}