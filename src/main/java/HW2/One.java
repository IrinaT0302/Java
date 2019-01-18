package HW2;
public class One {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        int[] result5 = runTask5(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(result5[i]);
            System.out.print(" ");
        }
        System.out.println();
        int[] array2 = new int[]{4, 1, 3, 2, 5};
        int[] result6 = runTask6(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(result6[i]);
            System.out.print(" ");
        }
    }

    public static int[] runTask5(int[] arr) {
        int middle = arr.length / 2;
        for (int i = 0; i < middle; i++) {
            int buffer = arr[i];
            arr[i] = arr[middle + i];
            arr[middle + i] = buffer;
        }
        return arr;
    }

    public static int[] runTask6(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }
}
