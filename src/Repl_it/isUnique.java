package Repl_it;

public class isUnique {
    // isUnique adında bir method oluşturun.
    // Parametre olarak int array alır.
    // ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür
    // (benzerlik yoksa true, var ise false).
    public static boolean isUnique(int[] list) {
        boolean b = true;

        for (int i = 0; i < list.length; i++) {
            for (int j =list.length-1; j > i; j--) {
                if (list[i] == list[j]) {
                    b = false;
                } //else
                    //b = true;
            }

        } return b;
    }
    public static void main(String[] args) {
        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        System.out.println(isUnique(list));
        int[] list2 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        System.out.println(isUnique(list2));
    }
}
