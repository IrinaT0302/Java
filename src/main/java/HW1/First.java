package HW1;

public class First {
    public static void main(String[] args) {
        int a = 83;
        int b = 25;
        int c = 91;
        double result1 = runTask1(a, b, c);
        System.out.println(result1);

    }

    public static double runTask1(int a, int b, int c) {
        if (a % 2 == 0) {
            return a * b / c;
        } else if ((a + c) % 2 == 0 || (b + c) % 2 == 0) return (int) Math.pow((double) a, (double) c);
        else return a + b - c;
    }
}
