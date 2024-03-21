import java.util.Scanner;
import java.util.Locale;

public class Taxas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		double salary = sc.nextFloat();
		double tax = 0.0;

		if (salary < 2000) {
			System.out.println("Isento");
		} else {
			if (salary > 2000.0 && salary <= 3000.0) {
				tax += (salary - 2000.0) * 0.08;
			} else if (salary > 3000.0 && salary <= 4500.0) {
				tax += 1000.0 * 0.08 + (salary - 3000.0) * 0.18;
			} else {
				tax += 1000.0 * 0.08 + 1500.0 * 0.18 + (salary - 4500.0) * 0.28;
			}
		}
		System.out.printf("R$ %.2f\n", tax);
		
		sc.close();
	}
}