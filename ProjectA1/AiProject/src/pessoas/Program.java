package pessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	static ArrayList<Pessoa> pessoas;
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pessoas = new ArrayList<Pessoa>();
		
		int action = 0;
		do {
			System.out.println("Indique a ação");
			System.out.println("0 - Sair");
			System.out.println("1 - Adicionar Pessoas");
			System.out.println("2 - Imprimir Pessoas");
			action = sc.nextInt();
			switch(action) {
			case 1: AddPessoa(); break;
			case 2: ImprimirArrayList(pessoas); break;
			default: System.out.println("Ação não encontrada, digite novamente");
				break;
			}
		}while(action != 0);
		
		sc.close();
	}
	
	static void AddPessoa() {
		String nome;
		int idade ;
		char sexo;
		Endereco endereco = new Endereco();
		
		System.out.println("Indique o nome da pessoa:");
		nome = sc.next();
		System.out.println("Indique a idade da pessoa:");
		idade = sc.nextInt();
		System.out.println("Indique o sexo da pessoa (M,F):");
		sexo = sc.next().charAt(0);
		
		System.out.println("Indique Endereço da pessoa:");
		System.out.println("Indique Logradouro:");
		endereco.setLogradouro(sc.next());
		System.out.println("Indique Complemento:");
		endereco.setComplemento(sc.next());
		System.out.println("Indique Numero:");
		endereco.setNumero(sc.nextInt());
		System.out.println("Indique CEP:");
		endereco.setCep(sc.next());
		
		Pessoa newPessoa = new Pessoa(nome, idade, sexo, endereco);
		pessoas.add(newPessoa);
		
	}
	
	static void ImprimirArrayList(ArrayList arrayList) {
		for(Object obj : arrayList) {
			System.out.println(obj.toString());
		}
	}
}
