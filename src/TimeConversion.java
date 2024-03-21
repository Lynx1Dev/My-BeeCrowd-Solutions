import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); //seconds

		int hours = t/3600;
		int minutes = (t-(hours * 3600))/60;
		int seconds = t-hours*3600-minutes*60;

		System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
		
		sc.close();
	}
}