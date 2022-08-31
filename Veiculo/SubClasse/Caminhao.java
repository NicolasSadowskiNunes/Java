package SubClasse;

import SuperClasse.Veiculo;

public class Caminhao extends Veiculo{

	public Caminhao(int veloMax, double peso, double preco, float toneladas, int comprimento, int alturaMax) {
		super(veloMax, peso, preco);
		this.setToneladas(toneladas);
		this.setComprimento(comprimento);
		this.setAlturaMax(alturaMax);
	}
	
	private float toneladas;
	private int comprimento;
	private int alturaMax;
	
	public float getToneladas() {
		return toneladas;
	}
	public void setToneladas(float toneladas) {
		this.toneladas = toneladas;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}
	
	public void mostrarDados() {
		System.out.println("Velocidade máxima do Caminhão: KM/h" +this.getVeloMax());
		System.out.println("Preço do Caminhão: R$" +this.getPreco());
		System.out.println("O peso do Caminhão(KG): " +this.getPeso());
		System.out.println("O comprimento do Caminhão é(Metros): " +this.getComprimento());
		System.out.println("A altura máxima do Caminhão é(Metros): " +this.getAlturaMax());
		System.out.println("A carga máxima do Caminhão(Toneladas):  " +this.getToneladas());
	}
	
	
}
