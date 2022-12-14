package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Chamando o Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Criando a vari?vel que vai guardar o n?mero da tabuada.
		int num;
		//Criando vari?vel auxiliar.
		int aux = 0;
		//Pedindo para o usu?rio o n?mero.
		System.out.print("Digite o n?mero: ");
		num = sc.nextInt();
		
		//Espacinho para deixar bunitinho pilimpinpin:)
		System.out.println();
		
		//La?o de repeti??o.
		// while == enquanto, ou seja
		// enquato aux for menor que 10, fa?a isso(que ? oq est? dentro
		//das chaves).
		while(aux < 10) {
			//Adicione + 1 a aux.
			//Para que aux seja maior q 10 uma hora.
			//E a repeti??o acabar.
			aux = aux + 1;
			
			//Vari?vel que vai guardar o resultado da multiplica??o.
			int resul = aux * num;
			
			//Print da tabu?da
			System.out.println((aux) + " * " + num + "= " + resul);
		}
		
		//aux agr vale 1, ou seja, n?o ? maior que 10.
		//ent?o ele vai fazer o procedimento mais uma vez.
		//agr aux vale 2, ou seja, n?o ? maior que 10....
		
		
		System.out.println();
		System.out.println("-----Com o For-----");
		System.out.println();
		//Entrada de dados.
		System.out.print("Digite um n?mero: ");
		int numero = sc.nextInt();
		
		//For == para, ou seja.
		// para i que ? igual a 0, se i for < que 11, adicione mais 1 a i.
		for(int i=0; i<11; i++) {
			//Vari?vel que guarda o resultado.
			int resultado = i * numero;
			//Print.
			System.out.println(resultado);
		}
		
		sc.close();
	}

}
