package Gun43.JavaException;

import java.util.Scanner;

public class _3_javaRuntimeExceptionEx1 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int a=oku.nextInt();     
        
        System.out.println("2. sayıyı giriniz");
        int b=oku.nextInt();

        System.out.println("a/b = " + a/b);
    }
}
/*1. sayıyı giriniz
4
2. sayıyı giriniz
l
Exception in thread "main" java.util.InputMismatchException// todo yanlış veri girişi oldu diyor
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at Gun43.JavaException._3_javaRuntimeExceptionEx1.main(_3_javaRuntimeExceptionEx1.java:13)// todo hata 13. satırda
	                        //todo hata bu _3_javaRuntimeExceptionEx1 classde

	                        b=0 alırsam 15. satırda a/b de hata var diyor
*/
