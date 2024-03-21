import java.util.Scanner;

public class Meals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input1 = sc.nextLine();
		String[] availableMeals = input1.split(" ");

		int avMeal1 = Integer.parseInt(availableMeals[0]);
		int avMeal2 = Integer.parseInt(availableMeals[1]);
		int avMeal3 = Integer.parseInt(availableMeals[2]);
		
		String input2 = sc.nextLine();
		String[] requestedMeals = input2.split(" ");

		int reqMeal1 = Integer.parseInt(requestedMeals[0]);
		int reqMeal2 = Integer.parseInt(requestedMeals[1]);
		int reqMeal3 = Integer.parseInt(requestedMeals[2]);
		

		int noMeal = 0;

		if (avMeal1 < reqMeal1) {
			noMeal += reqMeal1 - avMeal1;
		}
		if (avMeal2 < reqMeal2) {
			noMeal += reqMeal2 - avMeal2;
		}
		if (avMeal3 < reqMeal3) {
			noMeal += reqMeal3 - avMeal3;
		}
		System.out.println(noMeal);

		
		sc.close();
	}
}