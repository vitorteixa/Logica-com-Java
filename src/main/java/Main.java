import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// ESTRUTURA DE REPETIÇÃO: while

		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 99) {
			System.out.println("Digite um numero qualquer, ou o 99 para sair: ");
			opcao = entrada.nextInt();
		}
		;
		// ESTRUTURA DE REPETIÇÃO: do/while
		
		int opcao2;
		do{
			System.out.println("Digite um valor ou 99 para sair: ");
			Scanner entrada2 =  new Scanner(System.in); 
			opcao2 = entrada2.nextInt();
					}
			while(opcao2 != 99);
						
	
		// ESTRUTURA DE REPETIÇÃO: for
		// ++ = incremento
		// -- = decremento
		for (int cont = 0; cont <= 10; cont++) {

			System.out.println("Valor do contador: " + cont);
		}

		for (int cont2 = 5; cont2 <= 20; cont2++) {
			System.out.println("Valor do contador de 5 a 20: " + cont2);
		}
	}

}