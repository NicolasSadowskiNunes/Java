package SuperClasse;

public class ContaBancaria {

	private String nomeCliente;
	private int numeroConta;
	private double saldo;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String nomeCliente, int numeroConta, double saldo) {
		this.setNomeCliente(nomeCliente);
		this.setNumeroConta(numeroConta);
		this.setSaldo(saldo);
		
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.setSaldo(getSaldo()+valor);
		System.out.println("Saldo atualizado!: " +this.getSaldo());
	}
	
	public void sacar(double valor) {
		if(this.getSaldo() >= valor ) {
			this.setSaldo(getSaldo()-valor);
			System.out.println("Saldo atualizado!: " +this.getSaldo());
		}
		else
			System.out.println("Saldo Insuficiente! Operação não realizada!");
	}
	
	public void imprimirExtrato() {
		System.out.println("Nome do cliente: " +getNomeCliente());
		System.out.println("Número da conta: " +getNumeroConta());
		System.out.println("Saldo: " +getSaldo());
	}
	
	
	
}
