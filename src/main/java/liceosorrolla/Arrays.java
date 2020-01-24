  
package main.java.liceosorrolla;

public class Arrays {
	
	
	
	public static void main(String[] args) {
		
		int[] array = {666,66,6,9,99,999};
		
		System.out.println(mediana(array));
		
	}//MAIN
	
	public static int mediana(int []array) {
		
		int mediana = array[0];
		int numero;
		
		numero = array.length/2;
		
		if (array.length % 2 == 0) {
			
			mediana = (array[numero] + array[numero - 1]) /2;
			
		}	
		
		else { 
			
			mediana = array[numero];
			
		}
		
		return mediana;
	}//mediana

}//CLASS
