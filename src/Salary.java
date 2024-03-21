import java.util.Scanner;
import java.util.Locale;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		int emp_number = sc.nextInt();
		int emp_hours = sc.nextInt();
		float emp_wage = sc.nextFloat();

		float emp_salary = emp_hours * emp_wage;

		System.out.printf("NUMBER = %d\nSALARY = U$ %s\n", emp_number, String.format("%.2f",emp_salary));
		
		sc.close();
	}
}