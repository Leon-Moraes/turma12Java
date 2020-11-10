import java.util.Scanner;
public class exercicio5 {
	public static void main(String []args) {
		int numero = 233;
		do {
			 numero = numero + 3;
			System.out.println("\n"+numero);
			if(numero > 400 && numero < 456) {
				numero = numero + 2;
				}
		} while(numero > 233 && numero < 456);
		
	}
}
