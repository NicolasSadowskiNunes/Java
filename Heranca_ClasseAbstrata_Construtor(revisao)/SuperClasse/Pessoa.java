package SuperClasse;

public abstract class Pessoa {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void imprimir();
	
	public Pessoa(){}
	
	public Pessoa(String nome) {
		this.setNome(nome);
	}
}
