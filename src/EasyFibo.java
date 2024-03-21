import java.util.Scanner;

public class EasyFibo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int guess = sc.nextInt();
		int password = 2002;
		boolean lock = true;

		while (lock){
			if (guess != password){
				System.out.println("Senha Invalida");
				guess = sc.nextInt();
			} else {
				System.out.println("Acesso Permitido");
				lock=false;
			}
		}
		
		sc.close();
	}
}