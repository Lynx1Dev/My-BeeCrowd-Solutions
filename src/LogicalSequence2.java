import java.util.Scanner;

public class LogicalSequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count = 1;

        StringBuilder line = new StringBuilder();
        while(count <= num2) {
            line.setLength(0);
            for (int i = 0; i < num1 && count <= num2; i++) {
                if (i > 0) {
                    line.append(" ");
                }
                line.append(count);
                count++;
            }
            System.out.println(line);
        }
        sc.close();
    }
}
