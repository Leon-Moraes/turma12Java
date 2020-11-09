import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int A; int B; int areaTriangulo;
		System.out.println("Escreva os valores para o triangulo: \nBase:");
		A = input.nextInt();
		System.out.println("Altura:");
		B = input.nextInt();
		
			if(A > 0 && B > 0) {
				areaTriangulo = ((A * B)/2);
				System.out.println("A área do triangulo é: "+areaTriangulo);
			}
	}

}
