package Mentoring.Mentorluk13Burak;

import java.util.Arrays;

public class JavaArray2 {
    public static void main(String[] args) {
        // TODO ARRAY ELEMANLARINI STRİNG OLARAK YAZDIRMA

        String[] isimler={"Ayşe","Fatma","Hayriye"};
        int[] yaslar={18,19,20};
       // System.out.println(isimler); bu şekilde olursa java bunu okuyamıyor

        System.out.println(Arrays.toString(isimler));
        System.out.println(Arrays.toString(yaslar));
    }
}
