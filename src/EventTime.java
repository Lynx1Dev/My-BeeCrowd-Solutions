import java.util.Scanner;

public class EventTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inputDay1 = sc.nextLine();
		int day1 = Integer.parseInt(inputDay1.replaceAll("[^0-9]", ""));

		String inputDate1 = sc.nextLine();
		String[] inputDate1list = inputDate1.split(" : ");
		int date1hour = Integer.parseInt(inputDate1list[0]);
		int date1min = Integer.parseInt(inputDate1list[1]);
		int date1sec = Integer.parseInt(inputDate1list[2]);

		String inputDay2 = sc.nextLine();
		int day2 = Integer.parseInt(inputDay2.replaceAll("[^0-9]", ""));

		String inputDate2 = sc.nextLine();
		String[] inputDate2list = inputDate2.split(" : ");
		int date2hour = Integer.parseInt(inputDate2list[0]);
		int date2min = Integer.parseInt(inputDate2list[1]);
		int date2sec = Integer.parseInt(inputDate2list[2]);

		int daysPassed = 0;
		int hoursPassed = 0;
		int minPassed = 0;
		int secPassed = 0;



		System.out.printf("%s dia(s)\n%s hora(s)\n%s minuto(s)\n%s segundo(s)\n", daysPassed, hoursPassed, minPassed, secPassed);

		
		sc.close();
	}
}