import java.util.Scanner;
import java.util.Locale;

public class AreaCircumference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		double radius = sc.nextDouble();
		double PI = 3.14159;
		double areaC = PI * Math.pow(radius, 2);

		System.out.println("A=" + String.format("%.4f", areaC));
		
		sc.close();
	}
}