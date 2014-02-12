package questao9;

import java.util.ArrayList;
import java.util.Scanner;

public class NumStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> noms;
		String nome="";
		String nome2 = "";
		String nomesConcatenados="";
		System.out.println("Digite uma palavra:");
		nome = sc.next();
		while (!nome.equals(nome2)){			
			nomesConcatenados = nomesConcatenados.concat(nome);
			nome2=nome;
			System.out.println("Digite outra palavra:");
			nome = sc.next();
		}

	}

}
