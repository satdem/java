package Gun7;

public class JavaContains {

    public static void main(String[] args) {
        //bir stringin içinde karakter(ler)olup olmadığını kontrol eder
        String str="Hello";
        boolean varmı=str.contains("llo");// buna gerek yok boolean olduğubelli olssun diye yazdım

        System.out.println("llo var mı =" +str.contains("llo"));
        System.out.println("o var mı =" +str.contains("o"));
        System.out.println("k var mı =" +str.contains("k"));
        System.out.println(" O var mı =" +str.contains("O"));

    }
}
