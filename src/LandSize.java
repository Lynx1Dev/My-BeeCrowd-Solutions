import java.util.Scanner;
public class LandSize {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		boolean lock = true;

		while(lock){
			String input = sc.nextLine();
			if(input.equals("0")) {
				lock = false;
			} else {
				String[] info = input.split(" ");
				int a = Integer.parseInt(info[0]);
				int b = Integer.parseInt(info[1]);

				int area = a*b;
				int c = Integer.parseInt(info[2]);

				double allowedArea = area * ((double) c /100);
				double land = Math.sqrt(allowedArea);
				int landOK = (int) Math.floor(land);

				System.out.println(landOK);
			}
		}
		
		sc.close();
	}
}