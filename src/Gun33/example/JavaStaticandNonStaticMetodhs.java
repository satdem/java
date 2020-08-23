package Gun33.example;

public class JavaStaticandNonStaticMetodhs {

    public static void main(String[] args) {
        //benim bütün programlarımda kullanacağım tip dönüşümleri için metodlara ihtiyacım var
        //mesela int to string ;string to int ,vs vs bunları yapan bir sınıf yazınız

        //1.YÖNTEM
        int sayi=345;
        String strRakam=String.valueOf(sayi);
        int intrakam=Integer.parseInt(strRakam);

        //2.YÖNTEM kendimiz sınıf oluşturduk onları kullanacağız
       /* Utility util=new Utility();
        int a=util.getInteger(strRakam);
        double d=util.getDouble(strRakam);
        String s=util.getString(sayi);*/

        //yeni oluşturduğum sınıflar direk kullanılır (new demeden)
        strRakam=Utility.getString(sayi);
        intrakam=Utility.getInteger(strRakam);
        //aynı Math sınıfı gibi


    }
}
