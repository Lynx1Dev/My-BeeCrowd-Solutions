import java.util.Arrays;
import java.util.Scanner;

public class SimpleSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		int[] originalNumbers = new int[3];

		for (int i = 0; i < 3; i++) {
			numbers[i] = sc.nextInt();
			originalNumbers[i] = numbers[i];
		}

		Arrays.sort(numbers);

		for (int i = 0; i < 3; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.println(originalNumbers[i]);
		}
		
		sc.close();
	}
}