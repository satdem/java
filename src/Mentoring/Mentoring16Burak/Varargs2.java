package Mentoring.Mentoring16Burak;

import java.util.Arrays;

public class Varargs2 {
    public static void main(String[] args) {
        ogrenciler("Uğur",55,77,85,60);
        ogrenciler("Ayşe",45,89,90);
        ogrenciler("Osman",100,95,99);

    }
    public static void ogrenciler(String isim,int ...not){
        System.out.println(isim+ Arrays.toString(not));
    }
}
