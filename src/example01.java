import java.util.Scanner;

public class example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int i = 1;
        double SS = 0;

        while (i <= n) {
            SS += (Math.pow(-1, i - 1) * Math.pow(x, 2 * i - 1)) / i;
            i++;
        }
        System.out.println("SS = " + SS);
    }
}
