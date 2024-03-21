import java.util.Scanner;

public class Grenais {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int interWins = 0;
		int gremioWins = 0;
		int draws = 0;
		int grenais = 0;

		int response = 1;
		while (response == 1) {
			String[] goals = sc.nextLine().split(" ");
			int goalsInter = Integer.parseInt(goals[0]);
			int goalsGremio = Integer.parseInt(goals[1]);

			if (goalsInter > goalsGremio) {
				interWins++;
			} else if (goalsInter < goalsGremio) {
				gremioWins++;
			} else {
				draws++;
			}

			grenais++;

			System.out.println("Novo grenal (1-sim 2-nao)");
			response = sc.nextInt();
			if (response == 1) {
				sc.nextLine(); // consume the rest of the line
			}
		}

		String winner;
		if (interWins > gremioWins) {
			winner = "Inter venceu mais";
		} else if (interWins < gremioWins) {
			winner = "Gremio venceu mais";
		} else {
			winner = "Não houve vencedor";
		}

		System.out.printf("%d grenais\n", grenais);
		System.out.printf("Inter:%d\n", interWins);
		System.out.printf("Gremio:%d\n", gremioWins);
		System.out.printf("Empates:%d\n", draws);
		System.out.println(winner);
		
		sc.close();
	}
}