package agenda;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agenda = new Agenda();
		
		agenda.armazenarPessoa("João", 20, 1.80f);
		agenda.armazenarPessoa("Maria", 25, 1.60f);
		agenda.armazenarPessoa("Gustavo", 29, 1.90f);
		agenda.armazenarPessoa("Mario", 22, 1.87f);
		
		agenda.imprimeAgenda();
		
		agenda.imprimePessoa(1);
		
		agenda.removerPessoa("Maria");
		
		agenda.imprimeAgenda();
	}

}
