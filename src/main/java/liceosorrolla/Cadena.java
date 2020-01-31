package main.java.liceosorrolla;

public class Cadena {
	
	public static void palabra(String texto) {
		
		System.out.println("La longitud de la palabra es: "+texto.length()+" caracteres");
	}
	
	public static void cambio(String texto) {
		System.out.println("La palabra en mayusculas es: "+texto.toUpperCase());
		System.out.println("La palabra en minusculas es: "+texto.toLowerCase());
	}
	
	public static void main(String[] args) {
		String texto = "cadena";
		palabra(texto);
		cambio(texto);
	}

}

