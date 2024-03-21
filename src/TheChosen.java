import java.util.Scanner;
import java.util.Locale;

public class TheChosen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int count = sc.nextInt();
		int bestRegNum = 0;
		float bestGrade = 0;

		while (count!=0){
			int regNum = sc.nextInt();
			float grade = sc.nextFloat();

			if (grade >= 8 && grade > bestGrade) {
				bestGrade = grade;
				bestRegNum = regNum;
			}

			count--;
		}

		if (bestGrade != 0) {
			System.out.println(bestRegNum);
		} else {
			System.out.println("Minimum note not reached");
		}

		sc.close();
	}
}