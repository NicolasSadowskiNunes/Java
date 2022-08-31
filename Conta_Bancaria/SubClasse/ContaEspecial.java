package SubClasse;

import SuperClasse.ContaBancaria;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;
	
	public ContaEspecial() {
		
	}
	
	public ContaEspecial(String nomeCliente, int numeroConta, double saldo, double limite) {
		super(nomeCliente, numeroConta, saldo);
		this.setLimite(limite);
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacar(double valor) {
		if(this.getLimite() + this.getSaldo() >= valor ) {
			this.setSaldo(getSaldo() - valor);
			System.out.println("Saldo atualizado!: " +this.getSaldo());
		}
		else
			System.out.println("Saldo Insuficiente! Operação não realizada!");

}

}