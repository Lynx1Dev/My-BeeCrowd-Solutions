import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior1 = (a+b+Math.abs(a-b))/2;
		int maior2 = (maior1+c+Math.abs(maior1-c))/2;

		System.out.printf("%d eh o maior\n", maior2);
		
		sc.close();
	}
}