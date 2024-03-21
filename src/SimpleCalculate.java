import java.util.Scanner;
import java.util.Locale;

public class SimpleCalculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int p1_name = sc.nextInt();
		int p1_quantity = sc.nextInt();
		float p1_price = sc.nextFloat();

		int p2_name = sc.nextInt();
		int p2_quantity = sc.nextInt();
		float p2_price = sc.nextFloat();

		float totalCost = p1_quantity * p1_price + p2_quantity * p2_price;

		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", totalCost));
		
		sc.close();
	}
}