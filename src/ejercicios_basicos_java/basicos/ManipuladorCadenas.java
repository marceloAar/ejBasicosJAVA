package ejercicios_basicos_java.basicos;

public class ManipuladorCadenas {

	public static void main(String[] args) {
		
		String cadena = "hola planeta";
		
		//muestra la cadena en mayuscula
		System.out.println("Cadena en mayuscula: "+cadena.toUpperCase());
				
		//muestra el lardo de la cadena
		System.out.println("Largo de la cadena: "+cadena.length());
		
		//codigo ASCII  de cada caracter de la cadena
		byte[] codigoA = cadena.getBytes(); //Creamos un array de bytes e insertamos la devolucion del metodo		 
        System.out.println("Codigo ASCII de cada caracter");
        for (int i=0; i< cadena.length(); i++){
            System.out.println("Caracter " +cadena.charAt(i) +" - Codigo ASCII N° " + codigoA[i]); 
        }
		
	}
}
