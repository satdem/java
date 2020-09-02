package Repl_it.oopllnJava.Abstract.abstract_2;

import java.util.Scanner;

/* 6 class oluşturuldu. Calculator, Sum, Divide, Multiply , Substract , Main

Calculator'ı a super class yap.

super class'ın içinde;
calculating adında bir abstract method oluturunuz.
        Burada iki tane int parametresi vardır.
         return tipi int'dir.

Sum class'ın içinde;
        Calculator class'ına extend et.. (uzat, bağla)
        super class'ın içindeki calculating methodunu Override et.
        iki parametreyi topla ve sonucu return et.

Divide class'ının içinde,
         Calculator class'ına extend et.. (uzat, bağla)
        super class'ın içindeki calculating methodunu Override et.
         iki parametreyi böl ve sonucu return et.

Multiply class'ının içinde,
         Calculator class'ına extend et.. (uzat, bağla)
        super class'ın içindeki calculating methodunu Override et.
         iki parametreyi çarp ve sonucu return et.

Substract class'ının içinde,
         Calculator class'ına extend et.. (uzat, bağla)
        super class'ın içindeki calculating methodunu Override et.
         iki parametreyi birbirinden çıkart ve sonucu return et.

Main class'ın içinde
         scanner object oluşturunuz.
         iki int oluştur ve bu iki int değişkenine scanner ata.

Sum methodu çağır ve sonucu yazdır.
Divide methodu çağır ve sonucu yazdır.
Multiply methodu çağır ve sonucu yazdır.
Substract methodu çağır ve sonucu yazdır.
*/
abstract class Calculator{

abstract int calculating(int a,int b);
}

class Sum extends Calculator{

    @Override
    int calculating(int a, int b) {
        int toplam=a+b;
        return toplam;
    }
}

class Divide extends Calculator{

    @Override
    int calculating(int a, int b) {
        int bolme=a/b;
        return bolme;
    }
}

class Multiply extends Calculator{

    @Override
    int calculating(int a, int b) {
        int carp=a*b;
        return carp;
    }
}

class Substract extends Calculator{

    @Override
    int calculating(int a, int b) {
        int cıkar=a-b;
        return cıkar;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Sum sum=new Sum();
        System.out.println(sum.calculating(a,b));

        Divide divide=new Divide();
        System.out.println(divide.calculating(a,b));

        Multiply multiply=new Multiply();
        System.out.println(multiply.calculating(a,b));

        Substract substract=new Substract();
        System.out.println(substract.calculating(a,b));

    }

}