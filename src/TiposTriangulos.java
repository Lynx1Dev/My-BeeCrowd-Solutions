import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;
import java.util.Collections;

public class TiposTriangulos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		Double[] sides = new Double[3];

		for (int i = 0; i < 3; i++) {
			sides[i] = sc.nextDouble();
		}

		Arrays.sort(sides, Collections.reverseOrder()); // ordem decrescente dos valores inseridos para verificar se é possível formar triângulo.

		double a = sides[0]; // primeiro termo tem que ser maior
		double b = sides[1];
		double c = sides[2];

		if (a >= b + c) { // primeiro termo maior, senão não forma triângulo...
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if ( a*a == b*b + c*c ){
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