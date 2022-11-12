import java.util.Scanner;

public class example03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double x = scanner.nextDouble();
        int i = 1;
        double SS = 0;

        while (i <= n) {
            SS += Math.pow(-1, 2 * i) * Math.pow(1, 2 * i);
            i++;
        }
        System.out.println("SS = " + SS);
    }
}
