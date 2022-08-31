package SubClasse;

import SuperClasse.Pessoa;

public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;

	public Empregado(String nome, String end, String tel, int codigoSetor, double salarioBase, double imposto) {
		super(nome, end, tel);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
	}
	
	public Empregado(String nome, String end, String tel, double salarioBase, double imposto) {
		super(nome, end, tel);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
	}
	
	public Empregado(String nome, String end, String tel, double salarioBase) {
		super(nome, end, tel);
		this.setSalarioBase(salarioBase);

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

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public void CalcularSalario() {
		this.setSalarioBase(this.getSalarioBase() - this.getImposto());
		System.out.println("Valor atualizado após cobrança do imposto: " +this.getSalarioBase());
		
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " +this.getNome());
		System.out.println("Endereço: " +this.getEnd());
		System.out.println("Telefone: " +this.getTel());
		System.out.println("Código do Setor:" +this.getCodigoSetor());
		System.out.println("Credito:" +this.getSalarioBase());
	}
	
}
