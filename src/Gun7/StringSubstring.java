package Gun7;

public class StringSubstring {
    public static void main(String[] args) {
        //Substring:stringin belli bir bölümünü alma işlemi.
                   //0123456789...
        String text="Merhaba arkadaşlar";
        System.out.println("1.bölüm= " +text.substring(1,5));//1 nolu indexden 5 kadar olan kısım ama 5. dahil değil
        System.out.println("2.bölüm= " +text.substring(0,3));//0 nolu indexden 3 kadar olan kısım ama 3. dahil değil
        System.out.println("3.bölüm= " +text.substring(4));//verilen indexten (4 ten) itibaren sonuna kadar alır
        String strAlinan=text.substring(3,6);// şeklinde değişken atayabilirim.
        System.out.println("strAlinan = " + strAlinan);
    }
}
