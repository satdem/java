package Mentoring.Meryem34;

public class A {
    int a=10;
}
class B extends A{
    int a=20;
}
class Text{
    public static void main(String[] args) {
        A x=new B();
        System.out.println(x.a);//10

        B y=new B();
        System.out.println(y.a);//20
    }
}
