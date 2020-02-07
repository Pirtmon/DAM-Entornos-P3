package main.java.liceosorrolla;

public class Arrays {
	
	public static void maximo(int []array) {

		int max = 0;

		for(int i = 0; i < array.length; i++)
		{
			
			if(max<array[i])
			{
				max=array[i];
			}
		}
 
		System.out.println("El valor máximo es: " + max);
	}
	
	public static int minimo(int []array) {
		int menor = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] < menor) 
			{
				menor = array[i];
			}
		}
		return menor;
	}
	
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


	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		System.out.println(minimo(array));
		maximo(array);
		System.out.println(mediana(array));
	}	

}
