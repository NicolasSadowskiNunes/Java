package Main;

import SubClasse.ContaEspecial;
import SubClasse.ContaPoupanca;
import SuperClasse.ContaBancaria;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria("Junior", 12345, 2000);
		System.out.println("===== Cliente 1 =====");
		c1.imprimirExtrato();
		System.out.println("=== Foi sacado R$1500 ===");
		c1.sacar(1500);
		System.out.println("=== Foi depositado R$500 ===");
		c1.depositar(500);
		System.out.println("");
		
		ContaPoupanca c2 = new ContaPoupanca("Roger", 54321, 5000, 60);
		System.out.println("===== Cliente 2 =====");
		c2.imprimirExtrato();
		System.out.println("=== Foi sacado R$2000 ===");
		c2.sacar(2000);
		System.out.println("=== Foi depositado R$500 ===");
		c2.depositar(200);
		System.out.println("=== Em 60 dias sua conta rendeu... ===");
		c2.calcularNovoSalario(0.5);
		c2.imprimirExtrato();
		System.out.println("");
		
		ContaEspecial c3 = new ContaEspecial("Breno", 21345, 5000, 6000);
		System.out.println("===== Cliente 3 =====");
		c3.imprimirExtrato();
		System.out.println("=== Foi sacado R$2000 ===");
		c3.sacar(5000);
		System.out.println("=== Foi depositado R$500 ===");
		c3.depositar(200);
		
		
		
		
		
	}

}
