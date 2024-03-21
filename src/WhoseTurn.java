import java.util.Scanner;

public class WhoseTurn {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int cases = Integer.parseInt(sc.nextLine());

		while(cases!=0){
			String input1 = sc.nextLine();
			String[] names = input1.split(" ");

			String input2 = sc.nextLine();
			String[] numbers = input2.split(" ");
			int number1 = Integer.parseInt(numbers[0]);
			int number2 = Integer.parseInt(numbers[1]);

			int sum = number1 + number2;
			String winner;

			if(sum%2==0 && names[1].equals("PAR")){
				winner = names[0];
			} else if(sum%2==0 && names[3].equals("PAR")){
				winner = names[2];
			} else if(sum%2!=0 && names[1].equals("IMPAR")){
				winner = names[0];
			} else{
				winner = names[2];
			}
			cases--;

			System.out.println(winner);
		}
		
		sc.close();
	}
}