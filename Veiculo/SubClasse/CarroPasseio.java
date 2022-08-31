package SubClasse;

import SuperClasse.Veiculo;

public class CarroPasseio extends Veiculo {

	public CarroPasseio(String modelo, String cor, int veloMax, double peso, double preco) {
		super(veloMax, peso, preco);
		this.setCor(cor);
		this.setModelo(modelo);
	}
	
	private String cor;
	private String modelo;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void mostrarDados() {
		System.out.println("O modelo do Carro é: " +this.getModelo());
		System.out.println("A cor do Carro é: " +this.getCor());
		System.out.println("Velocidade máxima do Carro: KM/h" +this.getVeloMax());
		System.out.println("Preço do Carro: R$" +this.getPreco());
		System.out.println("O peso do Carro(KG): " +this.getPeso());
		
	}
	
}
