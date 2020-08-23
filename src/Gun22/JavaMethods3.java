package Gun22;

public class JavaMethods3 {
    public static void main(String[] args) {

        tekMiciftMi(3);
        tekMiciftMi(4);
        topla(46,15);

    }
    public static void tekMiciftMi(int sayi){
        if(sayi%2==0)
            System.out.println("çift");
        else {
            System.out.println("tek");
        }
    }
    public static void topla(int a,int b){
        System.out.println("toplam = " + (a+b));
        tekMiciftMi(a);
        tekMiciftMi(b);//bir fonk içinden başka fonk çağrılabilir.
    }
}
