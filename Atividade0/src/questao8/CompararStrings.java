package questao8;

import java.util.Scanner;

public class CompararStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome="";
		String nome2 = "";
		String nomes="";
		System.out.println("Digite uma palavra:");
		nome = sc.next();
		while (!nome.equals(nome2)){			
			nomes = nomes.concat(nome);
			nome2=nome;
			System.out.println("Digite outra palavra:");
			nome = sc.next();
		}
		System.out.println(nomes);
		

	}

}
