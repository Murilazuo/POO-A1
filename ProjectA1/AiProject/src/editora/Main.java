package editora;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Editora> editoras;
	static ArrayList<Livro> livros;
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		editoras = new ArrayList<Editora>();
		livros = new ArrayList<Livro>();
	
		int action = 0;
		do {
			System.out.println("Indique a ação");
			System.out.println("0 - Sair");
			System.out.println("1 - Adicionar Editora");
			System.out.println("2 - Adicionar Livro");
			System.out.println("3 - Imprimir Livro");
			System.out.println("4 - Imprimir Editora");
			action = sc.nextInt();
			switch(action) {
			case 1: AddEditora(); break;
			case 2: AddLivro(); break;
			case 3: ImprimirArrayList(livros); break;
			case 4: ImprimirArrayList(editoras); break;
			default: System.out.println("Ação não encontrada, digite novamente");
				break;
			}
			
		}while(action != 0);
		
		sc.close();
	}
	
	static void AddEditora() {
		Editora newEditora = new Editora();
		
		System.out.println("Indique o nome da editora:");
		newEditora.setNome(sc.next());
		
		System.out.println("Indique o email da editora:");
		newEditora.setEmail(sc.next());
		editoras.add(newEditora);
		
		newEditora.setId(Integer.toUnsignedLong(editoras.indexOf(newEditora)));
	}
	
	static void AddLivro() {
		System.out.println("Indique a editora editora do livro");
		int editoraId = sc.nextInt();
		
		if(editoraId < livros.size()) {
			Livro livro = new Livro();
			
			System.out.println("Indique o titulo do livro:");
			livro.setTitulo(sc.next());

			System.out.println("Indique o autor do livro:");
			livro.setAutor(sc.next());
			
			System.out.println("Indique o ano do livro:");
			livro.setAno(sc.nextInt());
			
			livro.setIdEditora(editoraId);
			livros.add(livro);
		}else {
			System.out.println("Id de editora não encontrado");
		}
	}
	
	static void ImprimirArrayList(ArrayList arrayList) {
		for(Object obj : arrayList) {
			System.out.println(obj.toString());
		}
	}
}
