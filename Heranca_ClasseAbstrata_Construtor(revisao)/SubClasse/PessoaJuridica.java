package SubClasse;

import SuperClasse.Pessoa;

public class PessoaJuridica extends Pessoa {
	
	private long cnpj;
	private long inscEstadual;
	private String nomeFantasia;
	private String razaoSocial;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String nome, long cnpj, long inscEstadual, String nomeFantasia, String razaoSocial) {
		super(nome);
		this.setCnpj(cnpj);
		this.setInscEstadual(inscEstadual);
		this.setNomeFantasia(nomeFantasia);
		this.setRazaoSocial(razaoSocial);
	}
	
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public long getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(long inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void imprimir() {
		System.out.println("Nome da pessoa: " +this.getNome());
		System.out.println("CNPJ: " +this.getCnpj());
		System.out.println("Inscrição estadual: " +this.getInscEstadual());
		System.out.println("Nome fantasia: " +this.getNomeFantasia());
		System.out.println("Razão social: " +this.getRazaoSocial());
	}
	
	
}
