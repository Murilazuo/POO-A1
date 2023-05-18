package agenda;

public class Pessoa {
	String nome;
	int idade;
	float altura;
	
	public Pessoa(String nome, int idade, float altura ) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}


	public float getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}
	
	
}
