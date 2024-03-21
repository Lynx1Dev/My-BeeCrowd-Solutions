import java.util.Scanner;

public class SalaryAdjust {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		float salary = sc.nextFloat();
		int rate;
		float adjust;

		if (salary <= 400) {
			rate = 15;
			adjust = (rate*salary)/100;
			salary *= 1+ (float) rate /100;
		} else if (salary <= 800) {
			rate = 12;
			adjust = (rate*salary)/100;
			salary *= 1+ (float) rate /100;
		} else if (salary <=1200) {
			rate = 10;
			adjust = (rate*salary)/100;
			salary *= 1+ (float) rate /100;
		} else if (salary <= 2000) {
			rate = 7;
			adjust = (rate*salary)/100;
			salary *= 1+ (float) rate /100;
		} else {
			rate = 4;
			adjust = (rate*salary)/100;
			salary *= 1+ (float) rate /100;
		}

		System.out.println("Novo salario: "+String.format("%.2f",salary)+"\nReajuste ganho: "+String.format("%.2f",adjust)+"\nEm percentual: "+rate+"%");
		
		sc.close();
	}
}