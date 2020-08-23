package Mentoring.Mentoring16Burak;

import java.util.Arrays;

public class VarArgs1 {
    public static void main(String[] args) {
        varargsDeneme(1,2,37,8);//istediğimiz kadar yazabiliriz

    }
    public static void varargsDeneme(int...a){
        System.out.println("Varargs deneme: "+a);
        System.out.println("Varargs deneme: "+ Arrays.toString(a));

    }
}
