package SubClasse;

import SuperClasse.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
	
	private int diasRendimento;
	
	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(String nomeCliente, int numeroConta, double saldo, int diasRendimento) {
		super(nomeCliente, numeroConta, saldo);
		this.setDiasRendimento(diasRendimento);
	}

	public int getDiasRendimento() {
		return diasRendimento;
	}

	public void setDiasRendimento(int diasRendimento) {
		this.diasRendimento = diasRendimento;
	}
	
	public void calcularNovoSalario(Double rendimento) {
		this.setSaldo(this.getSaldo()*(getDiasRendimento() * rendimento));
	}
	
	
	
}
