package SubClasse;

public class Vendedor extends Empregado {

	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String end, String tel, int codigosetor, double salarioBase, double imposto, double comissao, double valorVendas
) {
		super(nome, end, tel, codigosetor, salarioBase, imposto);
		this.setValorVendas(valorVendas);
		this.setComissao(comissao);
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public void calcularSalario(double taxa) {
		taxa = (this.getValorVendas() + (this.getComissao()/100));
		this.setSalarioBase((this.getSalarioBase() * taxa) - getImposto()) ;
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
