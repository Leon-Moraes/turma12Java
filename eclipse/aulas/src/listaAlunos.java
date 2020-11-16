import java.util.Scanner;
public class listaAlunos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int limite = 29;
				String nome[] = {"Ana veronica Nascimento cruz", "Bruno Estivalli Vicente", "Bruno Henrique Moraes Santos","Daniel Ferreira", "Dayane de Oliveira", 
				"Denis Vinicius Bolla da Silva", "Diego  Joaquim Silva", "Erick Alan", "Everson Silva", "Gabriel Enrique Cabral Silva", "Guilherme Alex", "Guilherme Fidelis Pereira",
				"Gustavo Miquéias Lopes Santana", "Isac Cordeiro de Oliveira", "Iuri Garcia Nunes", "Jenifer Lima Placido", "Jéssica Cristiane",
				"Joao Pedro Sena", "Larissa Moraes Ribeiro", "Leonardo de Moraes Magalhães", "Lucas Santos Gonçalves", "Mariana  de Cássia Antunes Oliveira",
				"Patricia da Silva Machado", "Paula Leticia", "Raul Fernandes","RICARDO MAGALHAES FINKELSTEIN", "Thiago dos Anjos", "Vitória Gonçalves de Freitas",
				"William Xavier"};
				int x;
				int quantidade;
				
				String alun;	
				boolean masculino[]={false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,false,false,true,false,true,true,false,false,false,true,true,true,false,true};
				String parar;
				
				System.out.println("CODIGO"+"\t"+"NOME");
				
				for( x = 0; x < limite; x++){
					System.out.println("\n-----------------------------------------------------------------");
					System.out.print("G5 - "+(x+1)+" | "+nome[x]);
					}
				
				System.out.println("\n");
				System.out.println("Escolha a quantidade de pessoas por grupo: ");
				quantidade = input.nextInt();
				int nGrupos = limite / quantidade;
				String grupo[] = new String[nGrupos];
				for(x = 0;  x > quantidade; x++ ) {
					grupo[x] = grupo[x] + nome[x];
					System.out.println(grupo[x]);
				
					System.out.println("Alunos: ");
					while (masculino[x] == true) {
						System.out.println(nome[x]);
					}
					System.out.println("Alunas: ");
					while (masculino[x] == false) {
						System.out.println(nome[x]);
					}

				}
				
			}	
	}


