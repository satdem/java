package Gun38.nonAccessModifier.staticModifier;

public class Simple {
    int a;//oluşturulacak her bir nesnenin kendi değişkeni(instens:nesneye ait değişken)
    static int b;//static ile sınıfın bir değişkeni oluyor.ve tek bir tanedir
    void increase(){
        a++;
        b++;
    }

    public static void main(String[] args) {

        Simple ornek=new Simple();
        ornek.a=5;

        Simple ornek2=new Simple();
        ornek2.a=7;

        Simple.b=5;//b class a ait olduğu için Simple ile kullanabiliyrum
        Simple.b=9;

        System.out.println("b = " + b);
        ornek.increase();//ornek.a=6,b=10
        ornek2.increase();//ornek2.a=8,b=11
        System.out.println("ornek.a = " + ornek.a);
        System.out.println("ornek2.a = " + ornek2.a);
        System.out.println("b = " + b);//burada b yi tanıyor
        // ama başka class da tanuması için Simple.b diye kullanmalıyız


    }
}
