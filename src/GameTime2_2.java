import java.util.Scanner;
import java.util.Locale;

public class GameTime2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int startH = sc.nextInt();
		int startM = sc.nextInt();

		int endH = sc.nextInt();
		int endM = sc.nextInt();

		int duration; // variável para armazenar a duração em minutos
		int durationH; // variável para armazenar a duração em horas
		int durationM; // variável para armazenar a duração em minutos

		// Verifica se o horário final é maior ou menor que o inicial
		if (endH >= startH) {
			// Se for maior ou igual, basta subtrair os minutos finais dos iniciais
			duration = endH*60 + endM - startH*60 - startM;
		} else {
			// Se for menor, soma 24 horas ao horário final antes de subtrair
			duration = (endH + 24)*60 + endM - startH*60 - startM;
		}

		// Verifica se a duração é positiva, negativa ou zero
		if (duration > 0) {
			// Se for positiva, basta dividir por 60 e pegar o resto
			durationH = duration/60;
			durationM = duration % 60;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationH, durationM);
		} else if (duration < 0) {
			// Se for negativa, usa o valor absoluto para fazer os cálculos
			durationH = Math.abs(duration)/60;
			durationM = Math.abs(duration) % 60;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationH, durationM);
		} else {
			// Se for zero, significa que foi de 24 horas
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		
		sc.close();
	}
}