	import java.util.Scanner;

	public class HighestAndPosition {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int[] lista = new int[100];
			int pos = 0;
			int max = -1;

			for(int i=0; i<lista.length; i++) {
				lista[i] = sc.nextInt();
				if(lista[i] > max) {
					max = lista[i];
					pos = i;
				}
			}

			System.out.println(max);
			System.out.println(pos+1);
			sc.close();
		}
	}