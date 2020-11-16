package banco;
import java.util.Scanner;
public class conta_empresarial {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		char operacao ;
		int numeroConta = 1;
		double saldo = 0.0;
		String cnpj;
		int limite = 10;
		String fatura[] = new String[limite];
		double credito;
		double debito;
		int movimento;
		int transacao = 0;
		double saldoLimite = 700;
		char usarLimite;
		
		System.out.println("Entre com o tipo de conta:\n - 1(Poupança)\n - 2(Corrente)\n - 3(Especial)\n - 4(Empresarial)");
		numeroConta = leia.nextInt();
		if(numeroConta == 4 ) {
			System.out.println("Entre com o CNPJ da empresa:");
			cnpj = leia.nextLine();
			System.out.println("CONTA: "+numeroConta+" CPNJ:"+cnpj);
			System.out.println("SALDO: R$"+saldo);
			
			for( movimento = 0; movimento < limite; movimento++ ) {
				
				System.out.println("Deseja fazer credito ou debito: (C - credito / D - debito) ");
				
				operacao = leia.next().toUpperCase().charAt(0);
				
				if(operacao == 'C' ) {
					
						System.out.println("Entre com o valor de CREDITO:(operação: "+(movimento +1 )+" de 10)");
						
						credito = leia.nextDouble();
						
						saldo = saldo + credito;
						
						System.out.println("SALDO: R$"+saldo);
						
						fatura[movimento] = "R$"+ credito + " - CREDITO";
						
				} else if(operacao == 'D') {
						System.out.println("Entre com o valor de DEBITO:(operação: "+(movimento +1)+" de 10)");
						
						debito = leia.nextDouble();
						
						saldo = saldo - debito;
						
						fatura[movimento] = "R$"+ debito + " - DEBITO";
						
						if(saldo == 0) {
							
							System.out.println("SALDO: R$"+saldo);
							
							System.out.print("Deseja fazer um emprestimo ? (S - Sim / N - Não)");
							
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
							System.out.print("Deseja fazer um emprestimo ? (S - Sim / N - Não)");
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
				System.out.println("Deseja realizar uma nova operação ? (S - Sim / N - Não)");
				operacao = leia.next().toUpperCase().charAt(0);
				if(operacao == 'S') {
					
				} else {
					System.out.println("\t\tFATURA\n");
						for(movimento = 0; movimento<limite; movimento++) {
							if(fatura[movimento] == null) {
								break;
							}
							System.out.println("Movimentação "+(movimento+1)+": "+fatura[movimento]);
							System.out.println("------------------------------------------");
						}
					System.out.println("SALDO: R$"+saldo);
					break;
					}
				
				
				}
			}
	if(numeroConta == 3) {
			
				while(transacao < 3) {
				System.out.print("\nDeseja fazer credito ou debito: (C - credito / D - debito): ");
				operacao = leia.next().toUpperCase().charAt(0);
				if(operacao == 'C' ) {
					System.out.print("Entre com o valor de deposito: ");
					credito = leia.nextDouble();
					saldo = saldo + credito;
					transacao++;
					System.out.printf("Saldo atualizado: R$%.2f\n", saldo);
				} else if(operacao == 'D') {
					System.out.print("Entre com o valor de saque: ");
					debito = leia.nextDouble();
					if (debito < saldo) {
						saldo = saldo - debito;
						System.out.printf("Saldo atualizado: R$%.2f", saldo);
						transacao++;
					} else if ((debito - saldo) <= saldoLimite) {
						while(true) {
							System.out.print("Deseja usar o seu limite especial? [S/N] ");
							usarLimite = leia.next().toUpperCase().charAt(0);
							if (usarLimite == 'S') {
								System.out.printf("Débito de R$%.2f realizado com sucesso.\n", debito);
								transacao++;
								debito -= saldo;
								saldo -= saldo;
								saldoLimite -= debito;
								saldo -= saldo;
								saldo -= debito;
								System.out.printf("\nSaldo atualizado: R$%.2f\n", saldo);
								System.out.printf("Disponibilidade no limite especial: R$%.2f\n", saldoLimite);
								break;
							} else if(usarLimite == 'N') {
								System.out.println("Acesso ao limite negado.");
								break;
							} else {
								System.out.println("Resposta esquisita!");
							}
						}
					}else {
						System.out.println("Transação não autorizada!");
						System.out.printf("Disponibilidade no limite especial: R$%.2f\n", saldoLimite);
						System.out.printf("Saldo atual: R$%.2f\n", saldo);
					}
				}
			}System.out.println("\n\nVocê ja realizou todas as suas movimentações permitidas por dia. Por hoje é só!");
		}
		}
	}
