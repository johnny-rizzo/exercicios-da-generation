package APLICACAO;

import java.util.Scanner;

//import classes.Conta;
//import classes.ContaEspecial;
//import classes.ContaEstudantil;
import CLASSES.ContaEmpresa;

public class BANCO {

	public static void main(String[] args) {
		int numero = 0;
		String cpf = null;
		int tipoConta = 0;
		boolean ativa = false;
		Scanner ler = new Scanner(System.in);
		//ContaEspecial contaMagica = null;
		//ContaEstudantil contaEstudante = null;
		ContaEmpresa contaEmpresa= null;
		String continuar = null;
		int opera�oes = 0;
		String[] movimentos = new String[10];
		String movimento = null;
		double valor = 0.00;
		double emprestimoEmpresa = 10000;
		// chamar a minha conta
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t\t\t\t KIGBJ-G1 BANK ");
		System.out.println();
		System.out.println("\t*~*~*~*~*~*~ [D� um Xeque-Mate na sua dor de cabe�a] ~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println();
		System.out.println("\t\t\t [1] Conta Poupan�a");
		System.out.println("\t\t\t [2] Conta Corrente");
		System.out.println("\t\t\t [3] Conta Especial");
		System.out.println("\t\t\t [4] Conta Empresarial");
		System.out.println("\t\t\t [5] Conta Estudantil");
		System.out.println("\t\t\t [6] Sair");
		System.out.println();
		System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");

		tipoConta = ler.nextInt();
		if (tipoConta == 1) {
		} else if (tipoConta == 2) {
		}
		// Giulliana Munhoz //
		else if (tipoConta == 3) {
			System.out.println("\t\t Tipo de conta selecionada: Estpecial");
			System.out.println("\t\t Digite o n�mero da sua conta:");
			numero = ler.nextInt();
			System.out.println("\t\t Digite o n�mero do seu CPf:");
			cpf = ler.next();
			//contaMagica = new ContaEspecial(numero, cpf, true, 1000.00); 
		} 
		//Johnny//
		else if (tipoConta == 4) {
			System.out.println("\t\t Tipo de conta selecionada: Conta Empresa");
			System.out.println();
			System.out.print("\t\t Digite o n�mero da sua conta: ");
			numero = ler.nextInt();
			System.out.print("\t\t Digite o n�mero do seu CPF: ");
			cpf = ler.next();
			contaEmpresa = new ContaEmpresa(numero, cpf, true, emprestimoEmpresa);
			
		}
		// Igor Pereira //
		else if (tipoConta == 5) {
			System.out.println("\t\t Tipo de conta selecionada: Estudante");
			System.out.println();
			System.out.print("\t\t Digite o n�mero da sua conta: ");
			numero = ler.nextInt();
			System.out.print("\t\t Digite o n�mero do seu CPF: ");
			cpf = ler.next();
			//contaEstudante = new ContaEstudantil(numero, cpf, true);
		
		} else if (tipoConta == 6) {
			System.out.println("\t\t Opera��o encerrada.");
			return;
		}
		do {
			System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
			System.out.println();
			System.out.println("\t\t\t\tKIGBJ-G1 BANK ");
			System.out.println();
			System.out.println("\t*~*~*~*~*~*~ [D� um Xeque-Mate na sua dor de cabe�a] ~*~*~*~*~*~*");
			System.out.println();
			System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
			System.out.println();
			if (tipoConta == 3) {
				System.out.println("Conta Especial");
				//System.out.println("Saldo " + contaMagica.getSaldo());
				System.out.println("MOVIMENTO [D] D�bito ou [C] Cr�dito: ");
				movimento = ler.next();
				System.out.println("Valor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					//contaMagica.credito(valor);
					movimentos[opera�oes] = "Cr�dito " + valor;
				} else {
					//contaMagica.debito(valor);
					movimentos[opera�oes] = "D�bito " + valor;
				}
				opera�oes = opera�oes + 1;
				System.out.print("\t\t\tContinuar S/N: ");
				continuar = ler.next();
			}
			else if (tipoConta == 4) {
				System.out.println("\t\t\t\tConta Empresa");
				System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
				System.out.println("\t\t\tSaldo " + contaEmpresa.getSaldo());
				System.out.print("\t\t\tMOVIMENTO [D] D�bito ou [C] Cr�dito: ");
				movimento = ler.next();
				System.out.print("\t\t\tValor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					contaEmpresa.credito(valor);
					movimentos[opera�oes] = "\t\t\tCr�dito " + valor;
				} else {
					contaEmpresa.debito(valor);
					movimentos[opera�oes] = "\t\t\tD�bito " + valor;
				}
				opera�oes = opera�oes + 1;
				}
				System.out.print("\t\t\tContinuar S/N: ");
				continuar = ler.next();
				
				

		} while (continuar.equalsIgnoreCase("S") && opera�oes < 10);
		//System.out.println(movimentos);
		
			//else if (tipoConta == 5) {
				System.out.println("\t\t\t\tConta Estudante");
				System.out.println("\t*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
				//System.out.println("\t\t\tSaldo " + contaEstudante.getSaldo());
				System.out.print("\t\t\tMOVIMENTO [D] D�bito ou [C] Cr�dito: ");
				movimento = ler.next();
				System.out.print("\t\t\tValor movimento: R$  ");
				valor = ler.nextDouble();
				if (movimento.equalsIgnoreCase("C")) {
					//contaEstudante.credito(valor);
					movimentos[opera�oes] = "\t\t\tCr�dito " + valor;
				} else {
					//contaEstudante.debito(valor);
					movimentos[opera�oes] = "\t\t\tD�bito " + valor;
				}
				opera�oes = opera�oes + 1;
				//}
				//System.out.print("\t\t\tContinuar S/N: ");
				continuar = ler.next();

		//} while (continuar.equalsIgnoreCase("S") && opera�oes < 10);
		System.out.println(movimentos);
	}

}