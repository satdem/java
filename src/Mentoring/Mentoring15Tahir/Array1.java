package Mentoring.Mentoring15Tahir;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

//TODO -------soru1----verilen arrayin ilk ve son elemanin yazdirin
        // int[]nums={1,2,3,4,5};   ======>  [1,5]
/* TODO  ----soru2----- Congratulation kelimesini Array yontemlirini kullanarak asagidaki outputu alin.

        [C, o, n, g, u, r, a, t, u, l, a, t, i, o, n, s]
        [s, n, o, i, t, a, l, u, t, a, r, u, g, n, o, C]
        snoitalutarugnoC
        Cingritilitiins  // o ,a ve u harfini i ye donuster*/
       /* int[]nums={1,2,3,4,5};
        int first=nums[0];// genel tanım
        int last=nums[nums.length-1];//genel tanım

        int[] array=new int[2];
        array[0]=first;
        array[1]=last;

        System.out.println(Arrays.toString(array));*/

        String a="Congratulations";
        String[] ad=a.split("");
        System.out.println(Arrays.toString(ad));
        System.out.println("*******************************************");

        String[] tad=new String[ad.length];
        for(int i=0;i<a.length();i++){
            tad[i]=ad[ad.length-i-1];
        }
        System.out.println(Arrays.toString(tad));
        System.out.println("*******************************************");

        for(int i=0;i<a.length();i++){
            System.out.print(tad[i]);
        }
        System.out.println("*******************************************");


    }
}
