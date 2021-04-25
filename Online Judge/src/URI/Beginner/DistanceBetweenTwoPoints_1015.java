// Accepted


package URI.Beginner;

import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class DistanceBetweenTwoPoints_1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point p1 = new Point(input.nextDouble(), input.nextDouble()), p2 = new Point(input.nextDouble(),
                input.nextDouble());
        System.out.format("%.4f\n", sqrt(pow((p2.x - p1.x), 2) + pow((p2.y - p1.y), 2)));
    }

    static class Point {
        public double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}