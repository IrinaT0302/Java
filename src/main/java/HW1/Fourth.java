package HW1;

public class Fourth {
    public static void main(String[] args) {
        int n = 5;
        int result3 = runTask3(n);
        System.out.println(result3);

    }

    public static int runTask3(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
