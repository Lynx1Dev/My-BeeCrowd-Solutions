import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;
import java.util.Collections;

public class TiposTriangulos2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		Double[] sides = new Double[3];

		for (int i = 0; i < sides.length; i++) {
			sides[i] = sc.nextDouble();
		}

		Arrays.sort(sides, Collections.reverseOrder());

		double a = sides[0];
		double b = sides[1];
		double c = sides[2];

		if ( a >= b + c ) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if ( a*a == b*b + c*c ) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if ( a*a > b*b + c*c ) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if ( a*a < b*b + c*c ) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if ( a == b && b == c ) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if ( (a == b && b != c) || (a == c && c != b) || (b == c && c != a) ) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		sc.close();
	}
}