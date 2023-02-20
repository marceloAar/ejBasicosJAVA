package ejercicios_basicos_java.basicos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class NumerosRandom {

	public static void main(String[] args) {
		
		List<Integer> listaNumeros = new ArrayList<Integer>();
		
		Integer numAleatorio =Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de numeros aleatorios: "));
		
		for(int i= 0; i < numAleatorio; i++) {
			double num = Math.random()*100;
			listaNumeros.add((int) num);
			
		}	
		
		System.out.println("Generando " +numAleatorio+ " numeros aleatorios entre 1 y 100");
		System.out.println(listaNumeros);

	}

}
