package Gun9;

public class JavaBolme {
    public static void main(String[] args) {
        int a=10;
        int b=3;

        System.out.println("a/b= "+a/b);//bölümün tam kısmını verir.çünkü int
        System.out.println("a/b = " + (double)a/b);//değişkenlerden birini double yapmak küsürlü sonuç için yeterli.
        System.out.println("a/b = " + (float)a/b);//hassasiyrt 7 haneli doublede 15 haneli.

        double c=3.14;
        double d=2.1;
        System.out.println("c/d = " + c/d);
//(double)(a/b) önce bölme int olarak yapılıyor sonra double olduğu için sonucu yine küsuratlı elde edemiyoruz.
//(double)a/b burada a double olduğu için sonucu double olarak veriyor.
        }

    }

