package Gun7;

public class StringIsEmpty {
    public static void main(String[] args) {
        //stringin içi tamamen boş mu onu kontrol eder.
        String str1="Hi";
        System.out.println("stringin içi boş mu " +str1.isEmpty());
        String str2="";
        System.out.println("stringin içi boş mu " +str2.isEmpty());

        String str3=" ";//boşluk var.
        System.out.println("stringin içi boş mu " +str3.isEmpty());
        boolean bosMu=str3.isEmpty();//booleana atanabilir.



    }
}
