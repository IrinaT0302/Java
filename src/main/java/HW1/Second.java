package HW1;

public class Second {
    //Периметры для всех фигур
    public static void main(String[] args) {
        System.out.println(areaOfRectangle(6.52, 8.51));
        System.out.println(areaOfSquare(3.69));
        System.out.println(areaOfCircle(5.75));
        System.out.println(areaOfTriangle(4.95, 6.25, 9.96));
    }

    private static double areaOfSquare(double a1) {
        return a1 * 4;
    }

    private static double areaOfRectangle(double width, double height) {
        return width * height;
    }

    private static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    private static double areaOfTriangle(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}