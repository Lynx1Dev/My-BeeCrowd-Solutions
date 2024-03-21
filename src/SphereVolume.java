import java.util.Scanner;

public class SphereVolume {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double radius = sc.nextDouble();

		double sphereVolume = (4.0/3) * 3.14159 * Math.pow(radius, 3);

		System.out.printf("VOLUME = %s\n", String.format("%.3f", sphereVolume));
		
		sc.close();
	}
}