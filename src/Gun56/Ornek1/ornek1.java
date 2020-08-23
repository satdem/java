package Gun56.Ornek1;


class C{

    public C(){
        System.out.println("C");
    }
}

class B extends C{
    public B(){
        //burada yazmasakta super(); var b den önce super Constructur c yi çağırıyor
        System.out.println("B");
    }
}
class A extends B {
    public A(){
        //burada da yazmasakta super(); var önce super Constructur B çağırıyor

        System.out.println("A");
    }
}

public class ornek1 {
    public static void main(String[] args) {
        A a=new A();//C B A oluyor çünkü sırayla boş Constructor ları da çağırıyor.

    }

}
