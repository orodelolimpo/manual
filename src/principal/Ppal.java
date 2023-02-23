package principal;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		int num = teclado.nextInt();
		
		System.out.println("Introduce otro numero");
		int num2 = teclado.nextInt();
		
		int resultado=num+num2;
		
		System.out.println(resultado);
	}

}
