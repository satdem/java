package Gun3;

public class ScopeInceleme {
    public static void main(String[] args) {

        int a=5;
        {//değişkenin geçerlilik sınırı oluyor.
            int b=7;
            a=8;

        }
        //bu kısımda a tanımlı ama b tanımlı değil.a yı kullanabilirim ,b yi tekrar tanımlayabiirim.

    }
}
