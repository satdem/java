package Gun17;

public class JavaNestedLoop3 {
    public static void main(String[] args) {
        //1 dan 5 e kadar(5 dahil) olan sayılarıntoplamını yazdırınız.
        //1+1=2
        //1+2=3
        //1+3=4
        //1+4=5
        //1+5=6

        //2+1=33
        //2+2=4
        //2+3=5
        //2+4=6
        //2+5=7
        //........

        for(int i=1; i<=5;i++){//dış döngü

            for(int j=1;j<=5;j++){
                System.out.println(i+" + "+j+" = "+(i+j));
            }
            System.out.println("-------------");

        }
    }
}
