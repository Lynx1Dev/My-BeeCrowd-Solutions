import java.util.Scanner;

public class PomekonsBattle {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int instances = Integer.parseInt(sc.nextLine());

		if (instances >= 0 && instances <= 100) {
			while(instances != 0) {
				int bonus = Integer.parseInt(sc.nextLine());

				String valuesInput1 = sc.nextLine();
				String[] values1 = valuesInput1.split(" ");

				int attackD = Integer.parseInt(values1[0]);
				int defenceD = Integer.parseInt(values1[1]);
				int dabrielLevel = Integer.parseInt(values1[2]);

				String valuesInput2 = sc.nextLine();
				String[] values2 = valuesInput2.split(" ");
				int attackG = Integer.parseInt(values2[0]);
				int defenceG = Integer.parseInt(values2[1]);
				int guarteLevel = Integer.parseInt(values2[2]);

				double valueD;
				double valueG;

				if (dabrielLevel % 2 == 0) {
					valueD = ((double) attackD + defenceD) / 2 + bonus;
				} else {
					valueD = ((double) attackD + defenceD) / 2;
				}

				if (guarteLevel % 2 == 0) {
					valueG = ((double) attackG + defenceG) / 2 + bonus;
				} else {
					valueG = ((double) attackG + defenceG) / 2;
				}

				String winner;
				if (valueD > valueG) {
					winner = "Dabriel";
				} else if (valueD < valueG) {
					winner = "Guarte";
				} else {
					winner = "Empate";
				}

				instances--;
				System.out.println(winner);
			}
		} else {
			System.out.println("No instances.");
		}
		
		sc.close();
	}
}