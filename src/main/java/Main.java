import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int valor;
		// Vetor
		int[] dados = new int[5];
		dados[2] = 9;
		dados[3] = 7;
		dados[0] = 6;
		System.out.println(dados[3]);

		/*
		 * você é um ávido observador de pássaros.
		 * Durante 14 dias você anotou quantos pássaros visitaram o seu jardim. Agora
		 * você deseja realizar uma estatística para responder as perguntas a seguir:
		 * A) número total de pássaros
		 * b) número de pássaros na primeira semana
		 * C) número de pássaros na segunda semana
		 * vetor de entrada:
		 * passarosPorDia = [2,5,0,7,4,1,30,2,5,0,1,3,1]
		 */

		int[] passarosPorDia = { 2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1 };
		int totalPassaros = 0;
		int passarosPrimeiraSemana = 0;
		int passarosSegundaSemana = 0;

		for (int i = 0; i < 14; i++) {
			totalPassaros = totalPassaros + passarosPorDia[i];
		}
		System.out.println("Total de passaros: " + totalPassaros);

		for (int i = 0; i < 7; i++) {
			passarosPrimeiraSemana = passarosPrimeiraSemana + passarosPorDia[i];
		}
		System.out.println("Total de passaros primeira semana: " + passarosPrimeiraSemana);

		for (int i = 7; i < 14; i++) {
			passarosSegundaSemana = passarosSegundaSemana + passarosPorDia[i];

		}
		System.out.println("Total de passaros segunda semana: " + passarosSegundaSemana);

		// Matriz

		int[][] dadosMatriz = new int[3][3];

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				dadosMatriz[i][j] = j;

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				System.out.println(dadosMatriz[i][j]);

		/*
		 * Considere que você tem a matriz abaixo:
		 * 1 2 3
		 * 1 |9 8 7
		 * 2 |5 3 2
		 * 3 |6 6 7
		 * 
		 * Neste exemplo, vamos encontrar o ponto de sela de uma matriz quadrática nxn
		 * como esta.
		 * 
		 * O ponto de sela é:
		 * -> O maior elemento em uma linha
		 * -> O menor elemento em uma coluna
		 */
		int[][] matriz = { { 9, 8, 7 }, { 5, 3, 2 }, { 6, 6, 7 } };
		int[] maiorLinha = new int[3];
		int[] menorColuna = new int[3];

		for (int i = 0; i < 3; i++)
			maiorLinha[i] = 0;
		for (int i = 0; i < 3; i++)
			menorColuna[i] = 10;

		// maior elemento na linha 0
		for (int i = 0; i < 3; i++)
			if (matriz[0][i] > maiorLinha[0])
				maiorLinha[0] = matriz[0][i];

		// maior elemento na linha 1
		for (int i = 0; i < 3; i++)
			if (matriz[1][i] > maiorLinha[1])
				maiorLinha[1] = matriz[1][i];

		// maior elemento na linha 2
		for (int i = 0; i < 3; i++)
			if (matriz[2][i] > maiorLinha[2])
				maiorLinha[2] = matriz[2][i];

		// menor elemento na coluna 0
		for (int i = 0; i < 3; i++)
			if (matriz[i][0] < menorColuna[0])
				menorColuna[0] = matriz[i][0];

		// menor elemento na coluna 1
		for (int i = 0; i < 3; i++)
			if (matriz[i][1] < menorColuna[1])
				menorColuna[1] = matriz[i][1];

		// menor elemento na coluna 2
		for (int i = 0; i < 3; i++)
			if (matriz[i][2] < menorColuna[2])
				menorColuna[2] = matriz[i][2];

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (maiorLinha[i] == menorColuna[j])
					System.out.println("Ponto de sela: " + maiorLinha[i]);

		// List e arrayList

			ArrayList<String> estados = new ArrayList<String>();
		
			estados.add("Espirito Santo");
			estados.add("Minas Gerais");
			estados.add("Rio de Janeiro");
			estados.add("Manaus");

			estados.remove("Rio de Janeiro");

			estados.contains("Manaus");
			System.out.println(estados);
		
		// Praticando com ArrayList

		ArrayList<String> bandas = new ArrayList<String>();

		bandas.add("Metallica");
		bandas.add("Iron Maiden");
		bandas.add("Kiss");
		System.out.println(bandas);

		bandas.add(bandas.indexOf("Kiss"),"Capital inicial");
		System.out.println(bandas);

		bandas.remove("Kiss");
		bandas.clear();
		System.out.println(bandas);

		
		
	}

}
