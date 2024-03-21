import java.util.Scanner;
public class Multiplos {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // número 1
		int B = sc.nextInt(); // número 2

		if ( A % B == 0 || B % A == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
	}
}