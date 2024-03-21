import java.util.Scanner;

public class BankNotes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		int original = valor;
		int notas[] = {100, 50, 20, 10, 5, 2, 1};
		int quantidade[] = new int[7];

		for (int i = 0; i < 7; i++) {
			quantidade[i] = valor / notas[i];
			valor = valor % notas[i];
		}

		// usei o loop for com 7 iterações, pois o processamento interno repete-se ao longo dos elementos das listas...
		//... quantidade e notas.
		// para cada elemento da lista quantidade, atribui-se o valor resultado do valor total dividido pelo valor da nota...
		//... correspondente na lista notas.
		// e o valor atualiza-se pelo resto da divisão entre valor total e o elemento da lista notas.

		System.out.println(original);
		System.out.println(quantidade[0] + " nota(s) de R$ 100,00");
		System.out.println(quantidade[1] + " nota(s) de R$ 50,00");
		System.out.println(quantidade[2] + " nota(s) de R$ 20,00");
		System.out.println(quantidade[3] + " nota(s) de R$ 10,00");
		System.out.println(quantidade[4] + " nota(s) de R$ 5,00");
		System.out.println(quantidade[5] + " nota(s) de R$ 2,00");
		System.out.println(quantidade[6] + " nota(s) de R$ 1,00");
		
		sc.close();
	}
}