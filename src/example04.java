import java.util.Scanner;

public class example04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] sonlar = new double[0];
        for (int i = 0; i < n; i++) {
            sonlar[i] = scanner.nextDouble();
        }

        int count = 0;
        for (int i = 1; i < sonlar.length - 1; i++) {
            if (sonlar[i - 1] < sonlar[i] && sonlar[i] < sonlar[i + 1]) count++;
        }
        System.out.println(count);
    }
}
