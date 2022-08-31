package Main;

import SubClasse.Administrador;
import SubClasse.Empregado;
import SubClasse.Fornecedor;
import SubClasse.Operario;
import SubClasse.Vendedor;

public class TesteBaseSalarial {

	public static void main(String[] args) {
		
		System.out.println("=== Fornecedor ===");
		Fornecedor fornecedor = new Fornecedor("João", "Rua 31", "9543124223", 500, 5000);
		fornecedor.mostrarDados();
		System.out.println("");
		fornecedor.obterSaldo();
		
		System.out.println("");
		System.out.println("=== Empregado ===");
		Empregado empregado = new Empregado("Roger", "Rua 323", "95662724223", 10, 1200, 15);
		empregado.mostrarDados();
		System.out.println("");
		empregado.CalcularSalario();
		
		System.out.println("");
		System.out.println("=== Administrador ===");
		Administrador adm = new Administrador("Cleito", "Rua 120", "94593489348", 21, 10000, 200);
		adm.mostrarDados();
		System.out.println("");
		adm.CalcularSalario();
		
		System.out.println("");
		System.out.println("=== Vendedor ===");
		Vendedor vend = new Vendedor("Clebson", "Rua 320", "4632462784", 11, 3000, 400, 15, 20);
		vend.mostrarDados();
		System.out.println("");
		vend.CalcularSalario();
		
		System.out.println("");
		System.out.println("=== Operário ===");
		Operario op = new Operario("Cleber", "Rua 354", "575353753753", 12, 4000, 300, 20, 10);
		op.mostrarDados();
		System.out.println("");
		op.CalcularSalario();
		
	}

}
