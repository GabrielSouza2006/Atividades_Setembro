import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os 3 números");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num = 0;
		
		if(num2 < num1){
	        num = num1;
	        num1 = num2;
	        num2 = num;
	    }

	    if(num3 < num1){
	        num = num1;
	        num1 = num3;
	        num3 = num;
	    }

	    if(num3 < num2){
	        num = num2;
	        num2 = num3;
	        num3 = num;
	    }
		
		System.out.println(num1 + ", " + num2 + ", " + num3);
		
	}

}
