package ejercicios_basicos_java.basicos;

import java.util.Scanner;

public class CicloDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		
		System.out.println("Ciclo Do While");
		
		do {
			
			System.out.println("*** MENU ***");
			System.out.println("");
			System.out.println("1. Crear");
			System.out.println("2. Ver");
			System.out.println("3. Salir");
			System.out.println("");
			System.out.println("Ingrese su opcion: ");
			opc = sc.nextInt();
			
			if ( opc == 1) {
				System.out.println("11111111111111111");
			}
			else if( opc == 2) {
				System.out.println("22222222222222222");
			}
			else if( opc == 3) {
				System.out.println("Programa terminado....");
			}
			else {
				System.out.println("Opcion ingresada no valida...");
			}			
			
		}
		while(opc != 3);
		
		sc.close();
	}

}
