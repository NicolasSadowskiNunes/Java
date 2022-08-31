package Main;

import java.util.Scanner;

import SubClasse.Caminhao;
import SubClasse.CarroPasseio;
import SuperClasse.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		int op;
		Veiculo veiculo = null;
		
		
		do {
		System.out.print("");
		System.out.println("=========== MENU ============");
		System.out.println("1 - Cadastrar Carro");
		System.out.println("2 - Cadastrar Caminhão");
		System.out.println("3 - Imprimir Dados");
		System.out.println("0 - Para Sair!");
		System.out.println("=============================");
		System.out.print("Escolha uma opção: ");
		System.out.print("");
		
		op=ler.nextInt();
		
			if(op == 1) {
				System.out.println("");
				
				System.out.println("============== Opção 1 Selecionada ==============");
				
				System.out.print("Modelo do Carro: ");
				String modelo = ler.next();
				
				System.out.print("Cor do Carro: ");
				String cor = ler.next();
				
				System.out.print("Velociade Máxima do carro: ");
				int veloMax = ler.nextInt();
				
				System.out.print("Preço do Carro: ");
				double preco = ler.nextDouble();
				
				System.out.print("Peso do Carro: ");
				double peso = ler.nextDouble();
				
				veiculo = new CarroPasseio(modelo, cor, veloMax, preco, peso);
					
				System.out.println("Carro Cadastrado");
				System.out.println("==================================================");
				System.out.println("");
				
			}
				
			else if(op == 2){
				System.out.print("");
				
				System.out.println("============== Opção 2 Selecionada ==============");
				
				System.out.print("Velocidade do Caminhão: ");
				int veloMax = ler.nextInt();
				
				System.out.print("Peso do Caminhão: ");
				double peso = ler.nextDouble();
				
				System.out.print("Carga Máxima do Caminhão: ");
				float toneladas = ler.nextFloat();
				
				System.out.print("Preço do Caminhão: ");
				double preco = ler.nextDouble();
				
				System.out.print("Comprimento do Caminhão: ");
				int comprimento = ler.nextInt();
				
				System.out.print("Altura Máxima do Caminhão: ");
				int alturaMax = ler.nextInt();
				
				veiculo = new Caminhao(veloMax, peso, preco, toneladas, comprimento, alturaMax);
					
				System.out.println("Caminhão Cadastrado");
				System.out.println("==================================================");
				System.out.print("");
				}
			
			
			else if(op == 3){
				veiculo.mostrarDados();
			}
			
		}while(op != 0);
		
	}

}
