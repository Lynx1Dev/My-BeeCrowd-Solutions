import java.util.Scanner;

public class LeftTurn {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


		while(!sc.hasNext("0")) {
			int comandos, correspondencia, direcao;
			String comando;

			correspondencia = 0; // Norte
			direcao = 0;
			comandos = Integer.parseInt(sc.nextLine());
			comando = sc.nextLine();

			char[] listaComandos = comando.toCharArray();
			for (int letra : listaComandos) {
				if(letra == 'D') {
					correspondencia++;
				}
				if (letra=='E') {
					correspondencia--;
				}
			}

			if(correspondencia<4 && correspondencia>=0) {
				direcao = Math.abs(correspondencia);
			} else if (correspondencia < 0) {
				direcao = correspondencia%4;
			} else {
				direcao = correspondencia%4;
			}

			switch (direcao) {
				case 0:
					System.out.println("N");
					break;
				case 1, -3:
					System.out.println("L");
					break;
				case 2, -2:
					System.out.println("S");
					break;
				case 3, -1:
					System.out.println("O");
					break;
			}
		}

		sc.close();
	}
}