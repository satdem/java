package Gun9;

public class JavaArithmeticOperators3 {
    public static void main(String[] args) {


    //Artırma azaltma operatörü
    int a=5;
    int b=2;
    int k=0;

    a++;//a nın değerini bir artırır. a=a+1 yani
    ++a;//a nın değerini bir artırır. a=a+1 yani

        k=a++;//++ lar sağda  olduğu için önce k=a çalışır sonra a=a+1 olur
        k=++a;//++ lar solda olduğu için önce a=a+1 olur sonra k=a olur.

        System.out.println(k);
        a--;//a nın değerini bir azaltır. a=a-1 yani
        --a;//a nın değerini bir azaltır. a=a-1 yani

        k=a--;//++ lar sağda  olduğu için önce k=a çalışır sonra a=a-1 olur
        k=--a;//++ lar solda olduğu için önce a=a-1 olur sonra k=a olur.
        System.out.println(k);

    }
}
