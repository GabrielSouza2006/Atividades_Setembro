import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe seu DDD: ");
		int ddd = sc.nextInt();
		
		if(ddd == 11) {
			System.out.println("S?o Paulo");
		}else if(ddd == 21) {
			System.out.println("Rio de Janeiro");
		}else if(ddd == 27) {
			System.out.println("Vit?ria");
		}else if(ddd == 31) {
			System.out.println("Belo Horizonte");
		}else if(ddd == 51) {
			System.out.println("Porto Alegre");
		}else if(ddd == 71) {
			System.out.println("Salvador");
		}else {
			System.out.println("???");
		}
	}

}
