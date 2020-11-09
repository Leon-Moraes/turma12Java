import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int anos = 0;
		
		System.out.println("Ensira sua idade: (ANOS)");
		
		anos = input.nextInt();
		
		int meses = (anos * 12);
		int dias = (meses) * 30;
		
		System.out.println("Sua idade: "+anos+" anos, em dias é: "+dias+" dias ");

	}

}
