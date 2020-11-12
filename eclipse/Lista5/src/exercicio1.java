import java.util.Scanner;
public class exercicio1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char pagamento;
		double valorProduto = 35.0;
		double valorPagamento;
		System.out.println("Valor do produto: R$"+valorProduto);
		System.out.println("Escolha a forma de pagamento do produto: (D/C)");
		pagamento = input.next().toUpperCase().charAt(0);
		if(pagamento == 'D') {
			valorPagamento = (valorProduto - (valorProduto * (20.0/100.0)));
			valorPagamento = Math.round(valorPagamento);
			System.out.println("E o valor do produto sai a R$"+valorPagamento);
		} else if(pagamento == 'C') {
			System.out.println("Pagamento á vista ou parcelado: ( A / P )");
			pagamento = input.next().toUpperCase().charAt(0);
			if(pagamento == 'A') {
				valorPagamento = (valorProduto - (valorProduto * (15.0/100.0)));
				valorPagamento = Math.round(valorPagamento);
				System.out.println("E o valor da parcela sai a R$"+valorPagamento);
			} else if(pagamento == 'P') {
				System.out.println("Parcelado em 2x ou 3x ? ( 2 / 3)");
				pagamento = input.next().toUpperCase().charAt(0);
				if(pagamento == '2') {
					valorPagamento = (valorProduto / 2.0);
					valorPagamento = Math.round(valorPagamento);
					System.out.println("O valor total do produto sai a R$"+valorProduto);
					System.out.println("E o valor da parcela sai a R$"+valorPagamento);
				} else if (pagamento == '3') {
					valorPagamento = ( valorProduto + (valorProduto*(10/100.0) ) / 3.0 );
					valorPagamento = Math.round(valorPagamento);
					System.out.println("O valor total do produto sai a R$"+(valorProduto*(10.0/100.0)));
					System.out.println("E o valor da parcela sai a R$"+valorPagamento);
				}
			}
		}
	}

}
