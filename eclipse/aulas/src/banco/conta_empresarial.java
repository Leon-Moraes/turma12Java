package banco;
import java.util.Scanner;
public class conta_empresarial {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		char operacao ;
		int numeroConta = 0001;
		double saldo = 0.0;
		String cnpj = "00000000/0001-00";
		int limite = 10;
		String fatura[] = new String[limite];
		double credito;
		double debito;	
		
		System.out.println("Entre com o tipo de conta:\n - 1(Poupan�a)\n - 2(Corrente)\n - 3(Especial)\n - 4(Empresarial)");
		numeroConta = leia.nextInt();
		if(numeroConta == 4 ) {
			System.out.println("CONTA: "+numeroConta+" CPNJ:"+cnpj);
			System.out.println("SALDO: R$"+saldo);
			
			for(int movimento = 0; movimento < limite; movimento++ ) {
				
				System.out.println("Deseja fazer credito ou debito: (C - credito / D - debito) ");
				
				operacao = leia.next().toUpperCase().charAt(0);
				
				if(operacao == 'C' ) {
					
						System.out.println("Entre com o valor de CREDITO:(opera��o: "+(movimento +1 )+" de 10)");
						
						credito = leia.nextDouble();
						
						saldo = saldo + credito;
						
						System.out.println("SALDO: R$"+saldo);
						
						fatura[movimento] = "R$"+ credito + " - CREDITO";
						
				} else if(operacao == 'D') {
						System.out.println("Entre com o valor de DEBITO:(opera��o: "+(movimento +1)+" de 10)");
						
						debito = leia.nextDouble();
						
						saldo = saldo - debito;
						
						fatura[movimento] = "R$"+ debito + " - DEBITO";
						
						if(saldo == 0) {
							
							System.out.println("SALDO: R$"+saldo);
							
							System.out.print("Deseja fazer um emprestimo ? (S - Sim / N - N�o)");
							
							operacao = leia.next().toUpperCase().charAt(0);
							
							if (operacao == 'S') {
								
								System.out.print("Insira o valor do emprestimo desejado: (Limite R$1000)");
								
								int emprestimo = leia.nextInt();
								
								if(emprestimo <= 1000) {
									
								saldo = saldo + emprestimo;
								
								System.out.println("SALDO: R$"+saldo);
								
								} else {
									System.out.println("Valor fora do limite, tente novamente mais tarde.");
								}
							}
						}
						if(saldo < 0) {
							saldo = 0;
							System.out.println("Saldo insuficiente.");
							System.out.println("SALDO: R$"+saldo);
							System.out.print("Deseja fazer um emprestimo ? (S - Sim / N - N�o)");
							operacao = leia.next().toUpperCase().charAt(0);
							if (operacao == 'S') {
								System.out.print("Insira o valor do emprestimo desejado: (Limite R$1000)");
								int emprestimo = leia.nextInt();
								if(emprestimo <= 1000) {
								saldo = saldo + emprestimo;
								System.out.println("SALDO: R$"+saldo);
								} else {
									System.out.println("Valor fora do limite, tente novamente mais tarde.");
								}
							}
						}
				}
				System.out.println("Deseja realizar uma nova opera��o ? (S - Sim / N - N�o)");
				operacao = leia.next().toUpperCase().charAt(0);
				if(operacao == 'S') {
					
				} else {
					System.out.println("\t\tFATURA\n");
						for(movimento = 0; movimento<limite; movimento++) {
							if(fatura[movimento] == null) {
								break;
							}
							System.out.println("Movimenta��o "+(movimento+1)+": "+fatura[movimento]);
							System.out.println("------------------------------------------");
						}
					System.out.println("SALDO: R$"+saldo);
					break;
					}
				}
			}
		}
	}
