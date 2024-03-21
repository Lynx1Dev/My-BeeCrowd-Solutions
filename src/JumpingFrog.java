import java.util.Scanner;

public class JumpingFrog {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int jumpHeight = sc.nextInt(), numberPipes = sc.nextInt(), basePipe = sc.nextInt();
		boolean check = true;

		while(numberPipes-- > 1) {
			int pipeHeight = sc.nextInt();

			if(Math.abs(basePipe - pipeHeight) > jumpHeight) {
				check = false;
				break;
			}

			basePipe = pipeHeight;
		}

		System.out.println(check ? "YOU WIN" : "GAME OVER");

		sc.close();
	}
}
