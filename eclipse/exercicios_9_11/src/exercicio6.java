import java.util.Scanner;

public class exercicio6 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int idade;
		System.out.print("Entre com a idade do nadador: ");
		idade = input.nextInt();
		
		if(idade >= 5 && idade <= 7 ) {
			System.out.println("O nadador � de categoria juvenil A, p�is possui "+idade+" anos");
		}
		if(idade >= 8 && idade <= 11) {
			System.out.println("O nadador � de categoria juvenil B, p�is possui "+idade+" anos");
		}
		if(idade == 12 && idade == 13) {
			System.out.println("O nadador � de categoria juvenil C, p�is possui "+idade+" anos");
		}
		if(idade >= 14 && idade <= 17) {
			System.out.println("O nadador � de categoria juvenil D, p�is possui "+idade+" anos");
		}
		if(idade <= 18) {
			System.out.println("O nadador � adulto, p�is possui "+idade+" anos");
		}
	}
}
