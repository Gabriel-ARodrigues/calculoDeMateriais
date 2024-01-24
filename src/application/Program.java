package application;

import java.io.IOException;
import java.util.Scanner;

import entities.AquecimentoPiscina;
import entities.CobreComCirc;
import entities.CobreSemCirc;
import entities.EmmettiComCirc;
import entities.EmmettiSemCirc;

public class Program {
	private final Scanner sc = new Scanner(System.in);

	public Program() throws InterruptedException, IOException {
		int choice;
		do {
			Menu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				CobreSemCirc();
				break;
			case 2: 
				EmmettiSemCirc();
				break;
			case 3:
				CobreComCirc();
				break;
			case 4:
				EmmettiComCirc();
				break;
			case 8:
				AquecimentoPiscina();
				break;
			case 9:
				System.exit(9);
			}
			choice = 0;
		} while (choice == 0);
	}


	public void Menu() {
		System.out.println("Escolha o tipo da instalação desejada:");
		System.out.println("1 - Cobre Sem Circulação Forçada");
		System.out.println("2 - Emmetti Sem Circulação Forçada");
		System.out.println("3 - Cobre Com Circulação Forçada");
		System.out.print("4 - Emmetii Com Circulação Forçada");
		System.out.print("5 - Piscina Filtragem");
		System.out.print("6 - Piscina Filtragem + Hidro");
		System.out.print("7 - Piscina Filtragem + Hidro + Aquecimento Solar");
		System.out.print("8 - Piscina Aquecimento Solar");
		System.out.print("9 - Finalizar Programa");
	}

	public void CobreSemCirc() throws InterruptedException, IOException {
		System.out.println("Digite a quantidade de coletores na instalação: ");
		int quantitidade = sc.nextInt();
		CobreSemCirc cobreSemCirc = new CobreSemCirc();
		cobreSemCirc.qtdLuvas(quantitidade);
		System.out.println("Gerando lista de material");
		System.out.println("");
		Thread.sleep(1000);
		System.out.println(cobreSemCirc);
		System.out.println("Pressione Qualquer Tecla para Retornar ao menu....");
		System.in.read();
	}

	private void EmmettiSemCirc() throws InterruptedException, IOException {
		System.out.println("Digite a quantidade de coletores na instalação: ");
		int quantitidade = sc.nextInt();
		EmmettiSemCirc emmettiSemCirc = new EmmettiSemCirc();
		emmettiSemCirc.qtdLuvas(quantitidade);
		System.out.println("Gerando lista de material");
		System.out.println("");
		Thread.sleep(1000);
		System.out.println(emmettiSemCirc);
		System.out.println("Pressione Qualquer Tecla para Retornar ao menu....");
		System.in.read();
		
	}
	
	public void CobreComCirc() throws InterruptedException, IOException {
		System.out.println("Digite a quantidade de coletores na instalação: ");
		int quantitidade = sc.nextInt();
		CobreComCirc cobreComCirc = new CobreComCirc();
		cobreComCirc.qtdLuvas(quantitidade);
		System.out.println("Gerando lista de material");
		System.out.println("");
		Thread.sleep(1000);
		System.out.println(cobreComCirc);
		System.out.println("Pressione Qualquer Tecla para Retornar ao menu....");
		System.in.read();
	}
	
	private void EmmettiComCirc() throws InterruptedException, IOException {
		System.out.println("Digite a quantidade de coletores na instalação: ");
		int quantitidade = sc.nextInt();
		EmmettiComCirc emmettiComCirc = new EmmettiComCirc();
		emmettiComCirc.qtdLuvas(quantitidade);
		System.out.println("Gerando lista de material");
		System.out.println("");
		Thread.sleep(1000);
		System.out.println(emmettiComCirc);
		System.out.println("Pressione Qualquer Tecla para Retornar ao menu....");
		System.in.read();
		
	}
	
	private void AquecimentoPiscina() throws InterruptedException, IOException {
		System.out.println("Digite a quantidade de coletores na instalação: ");
		int quantitidade = sc.nextInt();
		AquecimentoPiscina aquecimentoPiscina = new AquecimentoPiscina();
		aquecimentoPiscina.qtdTubos(quantitidade);
		System.out.println("Gerando lista de material");
		System.out.println("");
		Thread.sleep(1000);
		System.out.println(aquecimentoPiscina);
		System.out.println("Pressione Qualquer Tecla para Retornar ao menu....");
		System.in.read();
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {

		new Program();
	}

}
