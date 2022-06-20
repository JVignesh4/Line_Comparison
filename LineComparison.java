import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineComparison {
    public static void main(String[] args) {
        double lineLength = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The value Of x1 : ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter The value Of x2 : ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter The value Of y1 : ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter The value Of y2 : ");
        double y2 = scanner.nextDouble();
        lineLength = sqrt( (x2 - x1) * 2 + (y2 - y1) * 2);
        System.out.println(lineLength);
    }
}
