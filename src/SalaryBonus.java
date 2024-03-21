import java.util.Scanner;
import java.util.Locale;

public class SalaryBonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		String emp_name = sc.next();
		double emp_wage = sc.nextDouble();
		double emp_sales = sc.nextDouble();

		double emp_salary = (emp_wage + 1.15 * emp_sales);

		System.out.println("TOTAL = R$ " + String.format("%.2f", emp_wage));
		
		sc.close();
	}
}