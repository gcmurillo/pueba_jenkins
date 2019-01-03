package practica;
import java.util.Scanner;



public class Main {

	public static void main(String [ ] args) {
		
		Prima prima = new Prima();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Calculo de prima: ");
		System.out.println("Ingrese su edad: ");
		String edad = in.next();
		System.out.println("Ingrese su sexo (m: mujer|h: hombre) : ");
		String sexo = in.next();
		System.out.println("Ingrese su estado civil (soltero|casado|viudo|divorciado) : ");
		String estado = in.next();
		
		float calcPrima = prima.getPrima(edad, estado, sexo);
		System.out.println("Su prima tiene un valor de: $" + calcPrima);
		in.close();
	}
	
}
