package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Chamando o Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Criando a variável que vai guardar o número da tabuada.
		int num;
		//Criando variável auxiliar.
		int aux = 0;
		//Pedindo para o usuário o número.
		System.out.print("Digite o número: ");
		num = sc.nextInt();
		
		//Espacinho para deixar bunitinho pilimpinpin:)
		System.out.println();
		
		//Laço de repetição.
		// while == enquanto, ou seja
		// enquato aux for menor que 10, faça isso(que é oq está dentro
		//das chaves).
		while(aux < 10) {
			//Adicione + 1 a aux.
			//Para que aux seja maior q 10 uma hora.
			//E a repetição acabar.
			aux = aux + 1;
			
			//Variável que vai guardar o resultado da multiplicação.
			int resul = aux * num;
			
			//Print da tabuáda
			System.out.println((aux) + " * " + num + "= " + resul);
		}
		
		//aux agr vale 1, ou seja, não é maior que 10.
		//então ele vai fazer o procedimento mais uma vez.
		//agr aux vale 2, ou seja, não é maior que 10....
		
		
		System.out.println();
		System.out.println("-----Com o For-----");
		System.out.println();
		//Entrada de dados.
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		//For == para, ou seja.
		// para i que é igual a 0, se i for < que 11, adicione mais 1 a i.
		for(int i=0; i<11; i++) {
			//Variável que guarda o resultado.
			int resultado = i * numero;
			//Print.
			System.out.println(resultado);
		}
		
		sc.close();
	}

}
