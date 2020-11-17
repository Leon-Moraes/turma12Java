package Lista2;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado() {
		
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	
	public double calcularSalario(double salarioBase, double imposto) {
		this.imposto = imposto;
		this.salarioBase = salarioBase;
		double valorImposto = salarioBase * (imposto / 100);
		double calcularSalario = salarioBase - valorImposto;
		return calcularSalario;
	}
	
}
