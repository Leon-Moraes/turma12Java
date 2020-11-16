import java.util.Scanner;
public class Development {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		char operacao; 
		int numeroConta = 0; 
		double saldo = 0.0; 
		String CPF; 
//		int movimento; 
		int limite = 10;
		int transacao = 0;
		double credito; 
		double debito;
		double saldoLimite = 700;
		char usarLimite;
		String tipoContas[] = {"CONTA POUPANÇA", "CONTA CORRENTE", "CONTA ESPECIAL", "CONTA EMPRESA"};
		
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
		for (int x = 0; x < 4; x++) {
			System.out.printf("CONTA %d -> %s\n", x + 1, tipoContas[x]);
		}System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
		
		System.out.print("Entre com o numero da conta: ");
		numeroConta = leia.nextInt();
		System.out.print("CPF: ");
		CPF = leia.next();
		
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