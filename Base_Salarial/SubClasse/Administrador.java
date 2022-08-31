package SubClasse;

public class Administrador extends Empregado{
	
	private double ajudaDeCusto;
	
	public Administrador(String nome, String end, String tel, int codigoSetor, double salarioBase, double imposto) {
		super(nome, end, tel, codigoSetor, salarioBase, imposto);
		this.setAjudaDeCusto(ajudaDeCusto);
	}
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void calcularSalario() {
		this.setSalarioBase(this.getAjudaDeCusto() * this.getImposto());
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
