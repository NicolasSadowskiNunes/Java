package SuperClasse;

public class Veiculo {
	
	private int veloMax;
	private double peso;
	private double preco;
	
	public Veiculo(int veloMax, double peso, double preco) {
		this.setVeloMax(veloMax);
		this.setPeso(peso);
		this.setPreco(preco);
	}
	
	public int getVeloMax() {
		return veloMax;
	}
	public void setVeloMax(int veloMax) {
		this.veloMax = veloMax;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void mostrarDados() {
		System.out.println("Velocidade máxima do Carro: " +this.getVeloMax());
		System.out.println("Preço do Carro: " +this.getPreco());
		System.out.println("O peso do Carro " +this.getPeso());
		
	}
	
	
	
}
