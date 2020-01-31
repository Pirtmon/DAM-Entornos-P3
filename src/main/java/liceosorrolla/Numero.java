package main.java.liceosorrolla;



public class Numero {
	
	public static int factorial(int numero) {
		int factorial = 1;
		while (numero!=0) {
			  factorial=factorial*numero;
			  numero--;
		}
		return factorial;
	}
	
	
	public static String primo(int numero) {
		String primo;
        int contador = 0;
        for(int i = 1; i <= numero; i++){
            if((numero % i) == 0){
                contador++;
            }
        }
		if(contador <= 2){
            primo = "El numero es primo";
        }else{
            primo = "El numero no es primo";
        }
		return primo;
	}

	public static void main(String[] args) {
		int numero = 6;
		System.out.println(primo(numero));
		System.out.println(factorial(numero));
	}

}
