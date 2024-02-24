import java.util.Scanner; //importando a biblioteca Scanner

class Main {
	public static void main(String[] args) {
		// introdução às variáveis em java

		System.out.println("Adicione uma palavra:");
		String palavra;
		// Entradas

		Scanner entrada = new Scanner(System.in); // recebe do teclado
		palavra = entrada.nextLine(); // next pega conteúdo do teclado.
		System.out.println("Palavra: " + palavra);

		// saídas
		String nome = "Vitor T Santos";

		System.out.println(nome.contains("Vitor")); // verifica se existe dentro da String
		System.out.println(nome.length()); // conta o número de caracteres
		System.out.println(""); // pula linha após a execução
		System.out.print(""); // não pula linha após a execução
		System.out.printf(""); // não pula linha após a execução

		// operadores aritméticos

		double num1, num2, total;
		num1 = 10;
		num2 = 10;

		total = num1 + num2; // soma
		System.out.println("soma: " + total);
		total = num1 * num2; // multiplicação
		System.out.println("multiplicacao: " + total);
		total = num1 / num2; // divisão
		System.out.println("divisão: " + total);
		total = num1 - num2; // subtração
		System.out.println("subtração: " + total);
		total = num1 % num2; // resto da divisão
		System.out.println("resto da divisão: " + total);

		// estrutura sequencial cálculo de área do triângulo

		double base, altura, area;
		base = 10.0;
		altura = 8.0;

		area = (base * altura) / 2;
		System.out.println("A área do triângulo é: " + area);

	}

}
