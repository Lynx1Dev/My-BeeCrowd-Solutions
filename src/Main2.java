import java.util.Locale;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		float N1 = sc.nextFloat();
		float N2 = sc.nextFloat();
		float N3 = sc.nextFloat();
		float N4 = sc.nextFloat();

		float media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
		System.out.println("Média: " + String.format("%.2f", media));

		if ( media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if ( media < 5.0 ) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
			float exame = sc.nextFloat();
			System.out.println("Exame: " + String.format("%.2f", exame));
			float mf = ( media + exame ) / 2;
			System.out.println("Média Final: " + String.format("%.2f", mf));

			if ( mf >= 5.0 ) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado");
			}
		}
		
		sc.close();
	}
}