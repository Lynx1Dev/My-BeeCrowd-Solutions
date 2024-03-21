public class sSequence {
	public static void main (String[] args) {
		float soma = 0;

		for (int i = 1; i <= 100; i++) {
			soma += 1f/i;
		}

		System.out.printf("%.2f%n", soma);
	}
}