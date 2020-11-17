package Lista2;
import java.util.Scanner;
public class programaTesteFornecedor {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		Fornecedor fornecedor1 = new Fornecedor();
		
		System.out.println("Insira o nome do fornecedor: ");
		fornecedor1.setNome(input.nextLine());
		System.out.println("Insira o ano de nascimento do fornecedor "+fornecedor1.getNome());
		fornecedor1.setAnoNascimento(input.nextInt());
		
		System.out.println("O fornecedor"+fornecedor1.getNome()+" possui "+fornecedor1.idade(fornecedor1.getData(), fornecedor1.getAnoNascimento()));
		
		System.out.println("Insira o valor de credito do fornecedor: ");
		fornecedor1.setValorCredito(input.nextDouble());
		System.out.println("Insira o valor da divida do fornecedor: ");
		fornecedor1.setValorDivida(input.nextDouble());
		
		System.out.println("O fornecedor "+fornecedor1.getNome()+" possui R$ "+ fornecedor1.obterSaldo(fornecedor1.getValorCredito(), fornecedor1.getValorDivida()));
	}
}
