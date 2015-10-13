/**
 * Implementación del algoritmo de la burbuja
 * 
 * https://en.wikipedia.org/wiki/Bubble_sort
 * 
 */
public class Burbuja {
	public static void main(String[] args) {
		char data[] = {'q','w','r', 't'};
		//	
		System.out.println("Antes de ordenar");
		for(int i=0; i<data.length; i++) {	
			System.out.print( "[" + data[i] + "]");
		}
		System.out.println("\nDespues de ordenar:");
		for(int i=0; i<data.length; i++) {	
			for(int j=i+1; j<data.length; j++) {
				if(data[i] > data[j]) {
					char aux =  data[j];
					data[j] = data[i];
					data[i] = aux;
				}
			}
			System.out.print(" [" +data[i]+"] ");
		}
		System.out.println("");
	}
}
