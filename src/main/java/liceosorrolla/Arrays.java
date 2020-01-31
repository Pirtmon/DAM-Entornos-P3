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

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		System.out.println(minimo(array));
		maximo(array);
	}

}
