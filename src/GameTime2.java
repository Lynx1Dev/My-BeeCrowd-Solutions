import java.util.Scanner;
import java.util.Locale;

public class GameTime2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int startHour = sc.nextInt();
		int startMinute = sc.nextInt();
		int endHour = sc.nextInt();
		int endMinute = sc.nextInt();

		int durationHour = endHour - startHour;
		int durationMinute = endMinute - startMinute;

		if (durationHour < 0) {
			durationHour = 24 + durationHour;
		}

		if (durationMinute < 0) {
			durationMinute = 60 + durationMinute;
			durationHour--;
		}

		if (startHour == endHour && startMinute == endMinute) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationHour, durationMinute);
		}
		
		sc.close();
	}
}