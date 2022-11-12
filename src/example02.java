import java.util.Scanner;

public class example02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = 0.4;
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x = 5;
        double y = 0;

        while (x <= 10) {
            y += (a * a + b * x + Math.pow(x, c)) / (a * a + b * b + x * x);
            x += h;
        }
        System.out.println("y = " + y);
    }
}
