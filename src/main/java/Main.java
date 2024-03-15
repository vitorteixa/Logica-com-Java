import java.util.Scanner;

class Main {

	public static int somar(int numero1, int numero2){
		return (numero1 + numero2);
	}
	
	public static void main(String[] args) {
	 
		int total = Main.somar(1,2);
		System.out.println(total);
		for(int x=1; x<10; x++)
		{
							if(x%4 !=0 && x%2 == 0)
							{
												for(int y=1; y<5; y++) 
												{
																	System.out.println(y);
												}
							}
		};
		int d,x;
		d= 0;
		x = 314;
		while(x>1){
			x=x/2;d=d+1;
		}
		System.out.println("d = "+d);
		System.out.println("x = "+x);
/*
Considere criar um programa que seja responsável por receber o nome dos cinco melhores filmes ou séries que você já assistiu. Observe que para cada filme você necessitará de uma variável diferente para armazenar os valores na memória do computador. Após digitar o nome dos filmes ou séries, experimente mostrá-los na tela. Importante: somente com a prática você obterá a proficiência em programação.
*/
		Scanner entrada = new Scanner(System.in);
		String[] filmesSeries = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o nome do " + (i + 1) + "º filme ou série: ");
			filmesSeries[i] = entrada.nextLine();
		}

		System.out.println("Filmes ou séries que você já assistiu:");
		for (String filmeSerie : filmesSeries) {
			System.out.println(filmeSerie);
		}
       
	}
}


