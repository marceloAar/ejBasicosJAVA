package ejercicios_basicos_java.basicos;

public class IntercambioValores {

	public static void main(String[] args) {
		
		
		int aux = 0;
		int A = 10;
		int B = 5;
		
		System.out.println("Antes del cambio: "+A+" y "+B);
		
		aux = A;
		A = B;
		B = aux;
		
		System.out.println("Despues del cambio: "+A+" y "+B);

	}

}
