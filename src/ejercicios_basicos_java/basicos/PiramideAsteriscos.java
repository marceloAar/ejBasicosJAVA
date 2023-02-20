package ejercicios_basicos_java.basicos;

public class PiramideAsteriscos {

	public static void main(String[] args) {
		
		//ingresar numero de filas (altura) de la piramide
		int numeroFila = 6;		
		
		 for(int altura = 1; altura <= numeroFila; altura++){
	            //Espacios en blanco
	            for(int blancos = 1; blancos<=numeroFila-altura; blancos++){
	                System.out.print(" ");
	            }
	        //Asteriscos
	        for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
	            System.out.print("*");
	        }
	        System.out.println("");
	    }

	}

}
