package HW1;

public class Fifth {
    public static void main(String[] args) {
        int m = 123;
        int result4 = runTask4(m);
        System.out.println(result4);
    }

    public static int runTask4(int m) {
        return Integer.valueOf(new StringBuilder().append(m).reverse().toString());
    }
}


