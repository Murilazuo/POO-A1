package elevador;

public class Elevador {
	int andar;
	int maxAndar;
	int pessoasNoElevador;
	int capacidadeDePessoas;

	public int getAndar() { return andar; }

	public void setAndar(int andar) { this.andar = andar; }

	public int getMaxAndar() { return maxAndar;	}

	public void setMaxAndar(int maxAndar) { this.maxAndar = maxAndar; }

	public int getPessoasNoElevador() {	return pessoasNoElevador; }

	public void setPessoasNoElevador(int pessoasNoElevador) 
	{ this.pessoasNoElevador = pessoasNoElevador; }

	public int getCapacidadeDePessoas() { return capacidadeDePessoas; }

	public void setCapacidadeDePessoas(int capacidadeDePessoas) 
	{ this.capacidadeDePessoas = capacidadeDePessoas; }

	public Elevador(int capacidade, int maxAndar) { andar = 0;
		this.maxAndar = maxAndar;
		pessoasNoElevador = 0;
		capacidadeDePessoas = capacidade;
	}
	
	public void Entra(int pessoas) {
		capacidadeDePessoas += pessoas;
	}
	public void Sai(int pessoas) {
		capacidadeDePessoas -= pessoas;
	}
	public void Desce() {
		if(andar != 0) {
			andar--;
		}
	}
	public void Sobe() {
		if(andar != maxAndar) {
			andar++;
		}
	}
}
