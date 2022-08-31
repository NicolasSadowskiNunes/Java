package SubClasse;

import SuperClasse.Pessoa;

public class PessoaFisica extends Pessoa {
	
	private long cpf;
	private int nascimento;
	
	public PessoaFisica() {
	
	}
	
	public PessoaFisica(String nome, long cpf, int nascimento) {
		super(nome);
		this.setCpf(cpf);
		this.setNascimento(nascimento);
	}
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	public void imprimir() {
		System.out.println("Nome da pessoa: " +this.getNome());
		System.out.println("CPF: " +this.getCpf());
		System.out.println("Data de nascimento: " +this.getNascimento());
	}

}
