import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os 2 n�meros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("Esse � o maior: " + num1);
		}else {
			System.out.println("Esse � o maior" + num2);
		}
	}

}
