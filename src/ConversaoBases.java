import java.util.Scanner;

public class ConversaoBases {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		sc.nextLine();

		StringBuilder result = new StringBuilder(); // para armazenar os resultados.

		for (int i = 0; i < count; i++) {
			String[] input = sc.nextLine().split(" ");
			String number = input[0];
			String base = input[1];

			result.append(String.format("Case %d:\n", i+1));

			switch (base) {
				case "bin":
					int decimalValue = Integer.parseInt(number, 2);
					result.append(String.format("%d dec\n%s hex\n", decimalValue, Integer.toHexString(decimalValue)));
					break;
				case "dec":
					int hexValue = Integer.parseInt(number);
					result.append(String.format("%s hex\n%s bin\n", Integer.toHexString(hexValue), Integer.toBinaryString(hexValue)));
					break;
				case "hex":
					int decimalValueHex = Integer.parseInt(number, 16);
					result.append(String.format("%d dec\n%s bin\n", decimalValueHex, Integer.toBinaryString(decimalValueHex)));
					break;
			}

			if (i < count - 1) {
				result.append("\n");
			}
		}

		System.out.print(result);

		sc.close();
	}
}
