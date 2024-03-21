import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PossivelBaskhara {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		DecimalFormat df = new DecimalFormat("#.#####", DecimalFormatSymbols.getInstance(Locale.US));

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double delta = ( b * b ) - ( 4 * a * c );
		double raiz1 = ( -b + Math.sqrt(delta) ) / ( 2 * a );
		double raiz2 = ( -b - Math.sqrt(delta) ) / ( 2 * a );

		if ( a == 0 || delta < 0 ) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.println("R1 = " + Double.parseDouble(df.format(raiz1)));
			System.out.println("R2 = " + Double.parseDouble(df.format(raiz2)));
		}
		
		sc.close();
	}
}