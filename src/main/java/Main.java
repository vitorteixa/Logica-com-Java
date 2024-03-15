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

		int[] passarosPorDia = { 2, 5, 0, 7, 4, 1, 30, 2, 5, 0, 1, 3, 1 };
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

		for(int i = 7; i<14;i ++){
			passarosSegundaSemana = passarosSegundaSemana + passarosPorDia[i];
		
		}System.out.println("Total de passaros segunda semana: " +passarosSegundaSemana);
		// Matriz

		
		int[][] dadosMatriz = new int[3][3];

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				dadosMatriz[i][j] = j;

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				System.out.println(dadosMatriz[i][j]);

	}
}