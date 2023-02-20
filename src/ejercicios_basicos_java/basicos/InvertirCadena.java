package ejercicios_basicos_java.basicos;

public class InvertirCadena {

	public static void main(String[] args) {
		
		String cadena = "hola planeta";
		String cadenaUno = "";
		
		
		//metodo 1 charArt
		for( int i= cadena.length() -1; i >= 0 ; i--) {			
			cadenaUno += cadena.charAt(i);			
		}		
		System.out.println(cadenaUno);
		
		
		//metodo 2 StringBoulder - reverse - toString
		StringBuilder stringBuilder = new StringBuilder(cadena);
		String cadenaDos = stringBuilder.reverse().toString();
		
		System.out.println(cadenaDos);
	}

}
