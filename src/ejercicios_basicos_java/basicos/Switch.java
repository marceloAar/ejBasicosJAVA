package ejercicios_basicos_java.basicos;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;
		
		System.out.println("Ingrese primer numero");	
		num1 = sc.nextInt();
		
		System.out.println("Ingrese segundo numero");	
		num2 = sc.nextInt();
		
		System.out.println("1 Sumar\n2 Restar\n3 Multiplicar\n4 Dividir\n5 Salir");	
		opc = sc.nextInt();		
		
		
		switch(opc) {
		
			case 1:
				resultado = num1 + num2;
				System.out.println("La Suma de los numeros " +num1+ " y " +num2+ " es = " +resultado);					
				break;		
		
			case 2:
				resultado = num1 - num2;
				System.out.println("La Resta de los numeros " +num1+ " y " +num2+ " es = " +resultado);				
				break;
			
			case 3:
				resultado = num1 * num2;
				System.out.println("La Multiplicacion de los numeros " +num1+ " y " +num2+ " es = " +resultado);				
				break;
				
			case 4:
				resultado = num1 / num2;
				System.out.println("La Division de los numeros " +num1+ " y " +num2+ " es = " +resultado);				
				break;
				
			case 5:
				
				System.out.println("Programa Terminado");							
		
			default:
				System.out.println("Opcion ingresada no valida...");
			
		
		}
		
		sc.close();
		

	}
	

}
