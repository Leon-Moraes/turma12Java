import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int dias = 0;
		
		System.out.println("Ensira sua idade: (DIAS)");
		
		dias = input.nextInt();
		
		int meses = (dias / 30);
		int anos = (meses / 12);
		
		System.out.println("Sua idade: "+dias+" dias, em anos é: "+anos+" anos ");

	}

}
