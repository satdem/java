package Repl_it.oopllnJava.Encapsulation;

import java.util.Scanner;

public class Encapsulation1 {
    /*Burada iki adet class vardır. Biri Main, diğeri ise student ,
student classı içinde;
String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.
getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.
Main classın içinde;

Örnek:
age 12'dir.
name Steven'dır.
name(isim) olarak;
"Student name is Steven"
ve
age(yaş) olarak da;
"He is 12 years old"*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("bir yazı ve sayı yazınız" );
        String n1 = scan.nextLine();
        Scanner scan1=new Scanner(System.in);
        int i1 = scan1.nextInt();

        student st=new student();

        st.setName(n1);
        st.setAge(i1);

        System.out.println(st.getName());
        System.out.println(st.getAge());



    }

}
 class student{
    private String name;
    private int age;
    public String getName(){
        return "Student name is "+this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getAge() {
        return "He is "+this.age+" years old";
    }

    public void setAge(int age) {
        this.age = age;
    }
}
