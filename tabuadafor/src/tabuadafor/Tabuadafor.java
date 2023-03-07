package tabuadafor;

import java.util.Scanner;

public class Tabuadafor {

public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		for(int tabuada = 1; tabuada <=10; tabuada++) {
			for(int multiplica = 1; multiplica <=10; multiplica++) {
				System.out.println(tabuada + "x" + multiplica + " = " + tabuada*multiplica);
			}
		}
		
	}
}
