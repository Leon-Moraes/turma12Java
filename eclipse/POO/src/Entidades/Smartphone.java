package Entidades;

public class Smartphone {
	public String modelo;
	public double tamanhoTela;
	public int memoria;
	public int pixelsCamera;
	public String sysOperacional;
	public double hertz;
	public Smartphone(String modelo, double tamanhoTela, int memoria, int pixelsCamera, String sysOperacional, double hertz) {
		
		this.modelo = modelo;
		this.tamanhoTela = tamanhoTela;
		this.memoria = memoria;
		this.pixelsCamera = pixelsCamera;
		this.sysOperacional = sysOperacional;
		this.hertz = hertz;
	}
	public static void main(String[]args) {
		Smartphone samsung = new Smartphone("Galaxy S30", 6.1, 500, 16, "Android", 3.0);
		System.out.println("SmartPhone - Samsung:");
		System.out.println("Modelo; "+samsung.modelo);
		System.out.println("Tela: "+samsung.tamanhoTela+" polegadas.");
		System.out.println("Memoria: "+samsung.memoria+"GB.");
		System.out.println("OS: "+samsung.sysOperacional);
		System.out.println("Hertz do processador: "+samsung.hertz+"Ghz");
	}
}
