import java.util.Scanner;

public class GameTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int startDate = sc.nextInt();
		int endDate = sc.nextInt();
		int time;

		if ( endDate <= startDate ) {
			time = 24 - startDate + endDate;
			System.out.println("O JOGO DUROU " + time + " HORA(S)");
		} else {
			time = endDate - startDate;
			System.out.println("O JOGO DUROU " + time + " HORA(S)");
		}
		
		sc.close();
	}
}