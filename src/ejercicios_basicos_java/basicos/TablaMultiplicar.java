package ejercicios_basicos_java.basicos;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numero: ");
		int num = sc.nextInt();
		
		System.out.println("TABLA DEL: "+num);
		
		for( int i=1; i<=10; i++ ) {
			System.out.println(num+" * "+i+" = "+(i*num));
		}
		
		sc.close();
	}

}
