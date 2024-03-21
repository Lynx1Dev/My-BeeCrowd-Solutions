import java.util.Scanner;

public class ScoreValidation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		float input;
		double avg=0;
		int count=0;

		while (count<2){
			input = sc.nextFloat();

			if (input >= 0 && input <= 10.0) {
				count++;
				avg += input;
			} else {
				System.out.println("nota invalida");
			}
		}

		avg /= count;
		System.out.printf("media = %.2f\n", avg);
		
		sc.close();
	}
}