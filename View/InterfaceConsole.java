package View;

import java.util.Scanner;

import Controller.Fazenda;
import Model.Galinha;
import Model.Morcego;
import Model.Pato;
import Model.Vaca;

public class InterfaceConsole {

	private static Fazenda objFazenda = new Fazenda();
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		do {
		System.out.println("Digite 1 Para cadastrar um animal \n2 Para imprimir informações de um animal\n0 Para sair");
		numero = leia.nextInt();
		
		switch (numero) {
		case 1:
			escolherCadastro();
			break;
		case 2:
			escolherImpressao();
			break;
		default:
			break;
		}
	}while(numero != 0);
	}
	private static void escolherImpressao() {
		int numero = 0;

		do {
			System.out.println(
					"Qual Animal Deseja imprimir as informações?\n1-Pato\n2-Galnha\n3-Vaca\n4-Morcego\n0-Sair");
			numero = leia.nextInt();
			System.out.println();

			switch (numero) {
			case 1:
				imprimirPatos();
				break;
			case 2:
				imprimirGalinhas();
				break;
			case 3:
				imprimirVacas();
				break;
			case 4:
				imprimirMorcergos();
				break;
			case 0:
				break;
			default:
				System.out.println("Essa não é uma opção");
			}
		} while (numero != 0);

	}

	private static void escolherCadastro() {

		int numero = 0;

		do {
			System.out.println(
					"Qual Animal Deseja cadastrar?\n1-Pato\n2-Galnha\n3-Vaca\n4-Morcego\n0-Sair");
			numero = leia.nextInt();
			System.out.println();

			switch (numero) {
			case 1:
				inserirAnimal(numero);
				break;
			case 2:
				inserirAnimal(numero);
				break;
			case 3:
				inserirAnimal(numero);
				break;
			case 4:
				inserirAnimal(numero);
				break;
			case 0:
				break;
			default:
				System.out.println("Essa não é uma opção");
			}
		} while (numero != 0);
	}

	private static void inserirAnimal(int numero) {
		try {

			System.out.println("Cadastro");

			int alturaVoo = 0;
			int idade;
			float tamanho;
			String som;
			String cor;
			int ovos = 0;

			System.out.println("Qual a idade do animal?");
			idade = leia.nextInt();
			System.out.println("Qual o tamanho dele?");
			tamanho = leia.nextFloat();
			System.out.println("Qual cor ele tem?");
			cor = leia.next();

			if (numero == 1 || numero == 2) {
				System.out.println("Quantos ovos ele bota");
				ovos = leia.nextInt();
			}
			if (numero == 4 || numero == 1) {
				System.out.println("Qual a altura de voo?");
				alturaVoo = leia.nextInt();
			}

			if (numero == 1 || numero == 2) {
				if (numero == 2) {
					som = "Cacareja";
					Galinha galinhas = new Galinha(idade, tamanho, som, ovos, cor, alturaVoo);
					objFazenda.inserirAnimal(galinhas);
				} else {
					som = "Grasna";
					Pato patos = new Pato(idade, tamanho, som, ovos, cor, alturaVoo);
					objFazenda.inserirAnimal(patos);
				}
			} else {
				if (numero == 3) {
					som = "Muge";
					Vaca vacas = new Vaca(idade, tamanho, som, cor, alturaVoo);
					objFazenda.inserirAnimal(vacas);
				} else {
					som = "Farfalha";
					Morcego morcegos = new Morcego(idade, tamanho, som, cor, alturaVoo);
					objFazenda.inserirAnimal(morcegos);
				}
			}

			System.out.println("Cadastro realizado com sucesso");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void imprimirGalinhas() {
		try {
			objFazenda.imprimirGalinhas();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void imprimirPatos() {
		try {
			objFazenda.imprimirPatos();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void imprimirVacas() {
		try {
			objFazenda.imprimirVacas();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void imprimirMorcergos() {
		try {
			objFazenda.imprimirMorcego();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
