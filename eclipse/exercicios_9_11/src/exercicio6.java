import java.util.Scanner;

public class exercicio6 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int idade;
		System.out.print("Entre com a idade do nadador: ");
		idade = input.nextInt();
		
		if(idade >= 5 && idade <= 7 ) {
			System.out.println("O nadador é de categoria juvenil A, póis possui "+idade+" anos");
		}
		if(idade >= 8 && idade <= 11) {
			System.out.println("O nadador é de categoria juvenil B, póis possui "+idade+" anos");
		}
		if(idade == 12 && idade == 13) {
			System.out.println("O nadador é de categoria juvenil C, póis possui "+idade+" anos");
		}
		if(idade >= 14 && idade <= 17) {
			System.out.println("O nadador é de categoria juvenil D, póis possui "+idade+" anos");
		}
		if(idade <= 18) {
			System.out.println("O nadador é adulto, póis possui "+idade+" anos");
		}
	}
}
