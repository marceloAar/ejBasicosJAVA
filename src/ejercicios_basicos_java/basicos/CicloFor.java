package ejercicios_basicos_java.basicos;

public class CicloFor {

	public static void main(String[] args) {
		
		System.out.println("Ciclo For");
		
		for( int i=0; i<10; i++ ) {
			System.out.println("Numero: "+i);
		}
		
		for( int i=10; i>=0; i-- ) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		
		for( int i=0; i<=20; i+=2 ) {
			System.out.println(i+" ");
		}

	}

}
