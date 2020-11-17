package Lista2;
import java.util.Scanner;
public class programaTesteEmpregado {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		Empregado empregado1 = new Empregado();
		
		System.out.print("Insira o nome do empregado: ");
		empregado1.setNome(input.nextLine());
		System.out.print("Insira o código do setor do funcionário: ");
		empregado1.setCodigoSetor(input.nextInt());
		System.out.print("Insira o salario base do empregado: "+empregado1.getNome());
		empregado1.setSalarioBase(input.nextInt());
		System.out.print("Insira a porcentagem de imposto a ser retido do salario: ");
		empregado1.setImposto(input.nextInt());
		
		System.out.print("O salario total do empregado "+empregado1.getNome()+" do setor:"+empregado1.getCodigoSetor()+" é: R$ "+empregado1.calcularSalario(empregado1.getSalarioBase(), empregado1.getImposto()));
	}
}
