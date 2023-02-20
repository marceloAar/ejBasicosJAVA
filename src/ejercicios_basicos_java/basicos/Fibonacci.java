package ejercicios_basicos_java.basicos;

public class Fibonacci {

	public static void main(String[] args) {
		
		int x = 1;
		int temp;		
		int anterior = 0;
		
		System.out.println("Serie Fibonacci");
		
		  while(x<=120) {
		  
			  System.out.print(x+" ");
			  temp=x; 
			  x= x+anterior; 
			  anterior=temp; 
		  }
		 		
		
		
			
			
	
	}

}
