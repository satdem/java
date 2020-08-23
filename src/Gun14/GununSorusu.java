package Gun14;

public class GununSorusu {
    public static void main(String[] args) {
    //1- Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız
        int gunNo=100%7;
        switch (gunNo){
            case 0: System.out.println("100 gün sonra Çarşamba");break;
            case 1: System.out.println("100 gün sonra Perşembe");break;
            case 2: System.out.println("100 gün sonra Cuma");break;
            case 3: System.out.println("100 gün sonra Cumartesi");break;
            case 4: System.out.println("100 gün sonra Pazar");break;
            case 5: System.out.println("100 gün sonra Pazartesi");break;
            case 6: System.out.println("100 gün sonra Salı");break;

        }


    }
}
