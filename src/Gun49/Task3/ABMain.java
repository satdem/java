package Gun49.Task3;

public class ABMain {
    public static void main(String[] args) {

        A a=new A();
        System.out.println("a oluşturulduğunda = " + A.mesaj);

        B b=new B();
        System.out.println("b oluşturulduğunda = " + B.mesaj);

        System.out.println("b den sonra a nın durumu = " + A.mesaj);

        //Static değişkenlerin olduğu subclass larda static değişkenin
        // değeri değiştrildiğinde superclassında değişir.
        //çünkü tek bir "mesaj" var.static değişkenler hafızada tek bir değeri gösterirler.



    }
}

