package Mentoring.Mentorluk6;

public class equalsMethode {
    public static void main(String[] args) {
      /*  int a=3;
        int b=5;
        if(a==b) {
            System.out.println("They are equal");
        }
        if (a!=b){
            System.out.println("They are not equal");
        }*/

        String s1="We";
        String s2="You";
       /* if(s1==s2){
            System.out.println("They are equal");//== ve != bazen kabul etmeyebilir bunun için equels kullanılmalı
        }
        if (s1!=s2){ System.out.println("They are not equal");

       }*/
        if(s1.equals(s2))  System.out.println("They are equal");//stringlerde equals kullanılmalı.
        if (!s1.equals(s2)) System.out.println("They are not equal");
    }
}

