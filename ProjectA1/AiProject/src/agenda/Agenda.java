package agenda;
import java.util.ArrayList;

public class Agenda {
	
	ArrayList<Pessoa> pessoas;
	
	public Agenda() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	void armazenarPessoa(String nome, int idade, float altura) {
		if(pessoas.size() == 10) return;
		
		pessoas.add(new Pessoa(nome,idade,altura));
	}
	
	void removerPessoa(String nome) {
		pessoas.remove(buscaPessoa(nome));
	}
	
	int buscaPessoa(String nome) { 
		for(int i = 0; i < pessoas.size();i++) {
			if(pessoas.get(i).getNome() == nome) {
				return i;
			}
		}
		System.out.println("Pessoa não encontrada");
		return -1;
	}
	
	void imprimeAgenda() {
		System.out.println("Agenda: \n");
		for(int i = 0; i < pessoas.size();i++) {
			imprimePessoa(i);
		}
	}
	
	void imprimePessoa(int index) { 
		if(index == -1)
			System.out.printf("Index %s não encontrado", index);
		else 
			System.out.printf("\nPessoa %s - %s",index,pessoas.get(index).toString());
	}
}
