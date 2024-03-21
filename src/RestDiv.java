import java.util.Scanner;

public class RestDiv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numX = sc.nextInt();
		int numY = sc.nextInt();

		sc.close();

		for (; numX < numY; numX++) {
			if (numX%5==2 || numX%5==3){
				System.out.println(numX);
			}
		}
	}
}