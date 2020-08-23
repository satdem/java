package Mentoring.mentoring24Omer.Mentoring14omer;

import java.util.Arrays;

public class Soru2 {
    public static void main(String[] args) {
        int[] a=new int[5];

        for(int i=0;i<a.length;i++){
            int random=(int)((Math.random()*10)+1);
            a[i]=random;
        }
        System.out.println(Arrays.toString(a));
        int max=0;
        for(int j=0;j<a.length;j++){
            if(a[j]>max)
            {max=a[j];}
        }
        System.out.println("max = " + max);
    }
}
