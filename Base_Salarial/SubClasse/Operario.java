package SubClasse;

public class Operario extends Empregado{

	private double ValorProducao;
	private double comissao;
	
	public Operario(String nome, String end, String tel, int codigoSetor, double salarioBase, double imposto, double ValorProducao, double comissao) {
		super(nome, end, tel, codigoSetor, salarioBase, imposto);
		this.setValorProducao(ValorProducao);
		this.setComissao(comissao);
	}

	public double getValorProducao() {
		return ValorProducao;
	}

	public void setValorProducao(double valorProducao) {
		ValorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void calcularSalario(double taxa) {
		taxa = (this.getValorProducao() + (this.getComissao()/100));
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


