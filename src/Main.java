import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		DecimalFormat df = new DecimalFormat("#.#", DecimalFormatSymbols.getInstance(Locale.US));

		float N1 = sc.nextFloat();
		float N2 = sc.nextFloat();
		float N3 = sc.nextFloat();
		float N4 = sc.nextFloat();

		float media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
		System.out.println("Media: " + Float.parseFloat(df.format(media)));

		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
			float exame = sc.nextFloat();
			System.out.println("Nota do exame: " + Float.parseFloat(df.format(exame)));
			float mediaFinal = (media + exame) / 2;

			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}

			System.out.println("Media final: " + Float.parseFloat(df.format(mediaFinal)));
		}
		
		sc.close();
	}
}