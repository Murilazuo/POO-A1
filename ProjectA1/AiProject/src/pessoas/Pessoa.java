package pessoas;
public class Pessoa {
	String nome;
	int idade;
	char sexo;
	Endereco endereco;
	
	public Pessoa(String nome, int idade, char sexo, Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.endereco = endereco;
	}
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	public int getIdade() { return idade; }
	public void setIdade(int idade) { this.idade = idade; }
	public char getSexo() { return sexo; }
	public void setSexo(char sexo) { this.sexo = sexo; }
	public Endereco getEndereco() { return endereco; }
	public void setEndereco(Endereco endereco) { this.endereco = endereco; }
	@Override
	public String toString() {
		return  "Pessoa: \n"+
				"  Nome: " + nome + "\n" +
				"  Idade: " + idade + "\n" +
				"  Sexo: " + sexo + "\n" +
				endereco.toString();
	}
}
