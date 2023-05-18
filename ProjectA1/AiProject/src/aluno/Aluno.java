package aluno;

import java.util.Scanner;

public class Aluno {
	
	int[] notas;
	String nome;
	
	public Aluno() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indique o nome do aluno");
		this.nome = sc.next();
		
		System.out.print("Indique as notas do aluno:");
		this.notas = new int[3];
		
		for(int i = 0; i < 3;i++) {
			System.out.print("Semestre " + i + "\n");
			this.notas[i] = sc.nextInt();
		}
		
		sc.close();
	}

	int TotalDePontos() {
		int total = 0;
		for(int i = 0; i < 3;i++) {
			total += notas[i];
		}
		return total;
	}
	
	boolean AlunoPassou() {
		return TotalDePontos() >= 60;
	}
	String AlunoPassouString() {
		return AlunoPassou() ? "passou" : "rodou";
	}
	
	
	@Override
	public String toString() {
		String result="Aluno " + nome + "\n\n";
		for(int i = 0;i < 3;i++) {
			result += "Nota Semestre " + (i+1) + ": " + notas[i]+ "\n";
		}
		result  += "\nAluno " + AlunoPassouString() 
				+ (AlunoPassou() ? "" : ", restaram " 
				+ (60 - TotalDePontos()) + " pontos para passar.\n");
		
		return result;
	}
	
	
}
