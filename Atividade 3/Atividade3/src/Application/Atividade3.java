package Application;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as notas: ");
		double nota1 = sc.nextInt();
		double nota2 = sc.nextInt();
		double nota3 = sc.nextInt();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 6.0) {
			System.out.println("Passou de ano");
		}else {
			System.out.println("Nova oportunidade em 2023");
		}
		
	}

}
