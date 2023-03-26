package ejercicios;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();
		
		int newEdad = edad+1;
		
		System.out.println("El año siguiente tendrás " + newEdad);

	}

}
