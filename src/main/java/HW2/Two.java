package HW2;
public class Two {
    public static void main(String[] args) {
        String result = runTask7(58);
        System.out.println(result);

        String result2 = runTask8(85.495d);
        System.out.println(result2);

        int result3 = runTask9("64");
        System.out.println(result3);

        double result4 = runTask10("52.2845");
        System.out.println(result4);

        int result5 = runTask11("Один два три четыре пять");
        System.out.println(result5);

        int result6 = runTask12("Один два три четыре пять");
        System.out.println(result6);

        String result7 = runTask14("Один два три четыре пять");
        System.out.println(result7);

    }

    public static String runTask7(int m) {
        return Integer.toString(m);
    }

    public static String runTask8(double k) {
        return Double.toString(k);
    }

    public static int runTask9(String str) {
        return Integer.valueOf(str);
    }

    public static double runTask10(String str) {
        return Double.valueOf(str);
    }

    public static int runTask11(String str) {
        String[] s = str.split(" ");

        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].replace(".", "").replace(",", "");
        }

        int minLength = s[0].length();

        for (int i = 1; i < s.length; i++) {
            if (s[i].length() < minLength) {
                minLength = s[i].length();
            }
        }

        return minLength;
    }

    public static int runTask12(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    public static String runTask14(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length - 1; i++) {
            if (i > 0) {
                result += " ";
            }
            result += words[i];
        }
        return result;
    }
}
