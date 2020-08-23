package Mentoring.Omer34;

public class Super_Class {
    /*
Super_class isminde bir class oluşturun. içerisinde int num  = 20     değeri olsun.

public static void goster isminde bir method oluşturun ve "Bu method süper classın görüntülenme methodudur" print etsin.


Aynı sayfa içerisinde   Sub_class oluşturun ve Super_class'tan miras alın.
Sub_class içerisinde de         int num= 20 olsun. (super class ile baglantılı değil)

public static void goster methodu oluşturun ve "Bu method Sub classsın görüntülenme methodudur. "  print etsin.

my_method isminde void method oluşturun

içerisinde  sub classtaki goster methodunu ve super classtaki goster methodunu cagırın.
Aynı zamanda sub classstaki numarayı ve super classtaki int num u yazdırın.

daha sonra main methodu acıp my method u yazdırın.
Konsol şöyle olmalı :

Bu method Sub classın görüntülenme yöntemidir.
Bu method süper classın görüntülenme yöntemidir.
Sub classtaki eleman :10
süperClasstaki eleman  :20
 */
    int num=20;
    public static void goster(){
        System.out.println("Bu method süper classın görüntülenme methodudur.");
    }


}
class Sub_Class extends Super_Class{
    int num=10;
    public static void goster(){
        System.out.println("Bu method Sub classsın görüntülenme methodudur. ");
    }
    void my_method(){
        Sub_Class sb=new Sub_Class();

       Super_Class.goster();
       Sub_Class.goster();
        System.out.println("sb.num = " + sb.num);
    }

    public static void main(String[] args) {
        Sub_Class sb=new Sub_Class();
        System.out.println(sb.num);
        sb.my_method();


    }



}

