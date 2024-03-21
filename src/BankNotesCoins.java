import java.util.Scanner;
import java.util.Locale;

public class BankNotesCoins {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		double value = sc.nextDouble();

		System.out.println("NOTAS:");
		int cash100 = (int) (value / 100);
		value %= 100;
		System.out.println(cash100 + " nota(s) de R$ 100.00");

		int cash50 = (int) (value / 50);
		value %= 50;
		System.out.println(cash50 + " nota(s) de R$ 50.00");

		int cash20 = (int) (value / 20);
		value %= 20;
		System.out.println(cash20 + " nota(s) de R$ 20.00");

		int cash10 = (int) (value / 10);
		value %= 10;
		System.out.println(cash10 + " nota(s) de R$ 10.00");

		int cash5 = (int) (value / 5);
		value %= 5;
		System.out.println(cash5 + " nota(s) de R$ 5.00");

		int cash2 = (int) (value / 2);
		value %= 2;
		System.out.println(cash2 + " nota(s) de R$ 2.00");

		System.out.println("MOEDAS:");

		int cash1 = (int) (value);
		value %= 1;
		System.out.printf("%d moeda(s) de R$ 1.00%n", cash1);

		int cash050 = (int) ((value + 0.001) / 0.50);
		value %= 0.50;
		System.out.printf("%d moeda(s) de R$ 0.50%n", cash050);

		int cash025 = (int) ((value + 0.001) / 0.25);
		value %= 0.25;
		System.out.printf("%d moeda(s) de R$ 0.25%n", cash025);

		int cash010 = (int) ((value + 0.001) / 0.10);
		value %= 0.10;
		System.out.printf("%d moeda(s) de R$ 0.10%n", cash010);

		int cash005 = (int) ((value + 0.001) / 0.05);
		value %= 0.05;
		System.out.printf("%d moeda(s) de R$ 0.05%n", cash005);

		int cash001 = (int) ((value + 0.001) / 0.01);
		System.out.printf("%d moeda(s) de R$ 0.01%n", cash001);
		
		sc.close();
	}
}