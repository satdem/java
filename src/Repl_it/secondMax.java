package Repl_it;

public class secondMax {
    public static int max2Eleman(int[] arr) {
        int max = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2) max2 = arr[i];
        }
        int i = max2;
        return i;
    }

    public static int max2Eleman2(int[] arr) {
        int max = arr[0];
        int max2 = arr[0];
        for (int i : arr)
            if (i > max) {
                max2 = max;
                max = i;
            } else if (i > max2) max2 = i;
        return max2;
    }

    public static void main(String[] args) {
        int[] a = {15, 25, 17, 23, 11, 20, 8, 48};


        System.out.println(max2Eleman(a));
        System.out.println(max2Eleman2(a));

    }
}