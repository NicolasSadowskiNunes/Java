package SuperClasse;

public class Pessoa {

	private String nome;
	private String end;
	private String tel;
	
	public Pessoa(String nome, String end, String tel) {
		this.setNome(nome);
		this.setEnd(end);
		this.setTel(tel);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
