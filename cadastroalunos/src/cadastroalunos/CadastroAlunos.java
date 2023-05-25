package cadastroalunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAlunos {
	public static void main(String[] args) {
		List<Alunos> alunoList = new ArrayList<Alunos>();
		String nome;
		Integer ra;
		Double n1, n2, n3, n4;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CADASTRE UM ALUNO");
		System.out.println("Nome do Aluno:");
		nome = scan.next();
		System.out.println("RA do Aluno:");
		ra = scan.nextInt();
		System.out.println("Primeira nota do aluno: ");
		n1 = scan.nextDouble();
		System.out.println("Segunda nota do aluno: ");
		n2 = scan.nextDouble();
		System.out.println("Terceira nota do aluno: ");
		n3 = scan.nextDouble();
		System.out.println("Quarta nota do aluno: ");
		n4 = scan.nextDouble();
		
		
		Alunos aluno = new Alunos();
		aluno.setRa(ra);
		aluno.setNome(nome);
		aluno.setN1(n1);
		aluno.setN2(n2);
		aluno.setN3(n3);
		aluno.setN4(n4);
		alunoList.add(aluno);
		
		
		
		}
	}