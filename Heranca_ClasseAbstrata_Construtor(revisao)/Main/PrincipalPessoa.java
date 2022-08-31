package Main;

import java.util.Scanner;

import SubClasse.PessoaFisica;
import SubClasse.PessoaJuridica;
import SuperClasse.Pessoa;

public class PrincipalPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = null;
		Scanner ler = new Scanner(System.in);
		
		int op;
		
		do {
			System.out.println("");
		System.out.println("=== MENU ===");
		System.out.println("1 - Para cadastrar");
		System.out.println("2 - Para imprimir");
		System.out.println("0 - Para sair");
		System.out.println("============");
		System.out.print("Escolha uma das opções:");
		op=ler.nextInt();
		System.out.println("");
		
			if(op == 1) {
				System.out.println("");
				System.out.println("=== CADASTRAR ===");
				System.out.println("1 - Para pessoa Fisica");
				System.out.println("2 - Para pessoa Juridica");
				System.out.println("0 - Para sair");
				System.out.println("============");
				System.out.print("Escolha uma das opções:");
				op=ler.nextInt();
				System.out.println("");
				
				 if(op == 1){
					
					System.out.print("Digite o nome da pessoa: ");
					String nome = ler.next();
					System.out.print("Digite o CPF da pessoa: ");
					long cpf = ler.nextLong();
					System.out.print("Digite a data de nascimento da pessoa: ");
					int nascimento = ler.nextInt();
					
					pessoa = new PessoaFisica(nome, cpf, nascimento);
				 }
				 
				 else if(op == 2){
						
						System.out.print("Digite o nome da pessoa: ");
						String nome = ler.next();
						System.out.print("Digite o CNPJ da pessoa: ");
						long cnpj = ler.nextLong();
						System.out.print("Digite a inscrição estadual da pessoa: ");
						long inscEstadual = ler.nextLong();
						System.out.print("Digite o nome fantasia da pessoa: ");
						String nomeFantasia = ler.next();
						System.out.print("Digite a razão social da pessoa: ");
						String razaoSocial = ler.next();
						
					pessoa = new PessoaJuridica(nome, cnpj, inscEstadual, nomeFantasia, razaoSocial);
				 }
				 
			}
			
			else if(op == 2){
				
				if(pessoa == null){
					System.out.println("ERRO! CADASTRE ALGUÉM ANTES!");
				}
				else {
				System.out.println("");
				pessoa.imprimir();
				System.out.println("");
				}
			 }
		
		}while(op != 0);
	}

}
