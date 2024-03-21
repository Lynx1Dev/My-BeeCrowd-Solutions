import java.util.Scanner;

public class RollerCoaster {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()) {
			int guests = sc.nextInt();
			int minH = sc.nextInt();
			int maxH = sc.nextInt();

			int count = 0;
			int[] nums = new int[guests];

			for(int num : nums) {
				num = sc.nextInt();
				if(num<=maxH && num>=minH) {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}