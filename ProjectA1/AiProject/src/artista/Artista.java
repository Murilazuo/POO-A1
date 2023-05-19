package artista;

import java.util.ArrayList;
import java.util.Scanner;

public class Artista {
	String name;
	ArrayList<String> albuns;
	
	Scanner sc;
	
	public String getName() {
		return name;
	}
	
	public Artista(Scanner sc) {
		this.sc = sc;
		albuns = new ArrayList<String>();
		System.out.println("Indique o nome do artista");
		name = sc.next();
		
		int action = 0;
		
		do {
			
			action = GetAction();
			
			if(action == 0) {
				
				System.out.println("Indique o album do Artista");
				albuns.add(sc.next());
			}
			
		}while (action == 0);
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "Nome " + name + "\n";
		result += "\nAlbuns [" + albuns.size() + "]:";
		
		for(int i = 0; i < albuns.size();i++) {
			result += "\n" + i + "  - " + albuns.get(i);
		}
		result += "\n";
		return result;
	}
	
	int GetAction() {
		String next = "";
		boolean rightAnswer;
		
		do {
			System.out.println("Para adicionar um album digite 0, para sair digite 1");
			next = sc.next();
			System.out.println(next);
			
			rightAnswer = next.charAt(0) == '0' || next.charAt(0) == '1';
			
			if(!rightAnswer) {
				System.out.println("Entrada errada, digite novamente");
			}
		}while(!rightAnswer);
		
		
		return Integer.parseInt(next);
	}
}
