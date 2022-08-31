package SubClasse;

import SuperClasse.Pessoa;

public class Fornecedor extends Pessoa{
	
	private double valorDivida;
	private double valorCredito;
	
	public Fornecedor(String nome, String end, String tel, double valorCredito, double valorDivida) {
		super(nome, end, tel);
		this.setValorDivida(valorCredito);
		this.setValorCredito(valorDivida);
	}
	
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public void obterSaldo() {
			this.setValorCredito(this.getValorCredito()-getValorDivida());
			System.out.println("Valor atualizado após cobrança da divida: " +this.getValorCredito());
		}
	
	public void mostrarDados() {
		System.out.println("Nome: " +this.getNome());
		System.out.println("Endereço: " +this.getEnd());
		System.out.println("Telefone: " +this.getTel());
		System.out.println("Credito:" +this.getValorCredito());
	}
	
	}
	

