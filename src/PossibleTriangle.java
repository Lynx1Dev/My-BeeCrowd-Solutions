import java.util.Scanner;
import java.util.Locale;

public class PossibleTriangle {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();

		if ( a + b > c && a + c > b && b + c > a ) {
			float triangle_perimeter = a + b + c;
			System.out.println("Perimetro = " + String.format("%.1f", triangle_perimeter));
		} else {
			float trapezium_area = ( a + b ) * c/2;
			System.out.println("Area = " + String.format("%.1f", trapezium_area));
		}
		
		sc.close();
	}
}