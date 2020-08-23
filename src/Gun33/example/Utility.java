package Gun33.example;

public class Utility {
    //2. yöntem için bu burada dursun
   /* public String getString(int value){//public: olursa sadece diğer tarafta kullanabilmem için
                             // once dünyaya getirmem gerek(new Utility taanımlamalıyım)

        return String.valueOf(value);
    }

    public int getInteger(String value){
        return Integer.parseInt(value);
    }

    public double getDouble(String value){
        return Double.parseDouble(value);

    }*/

    public static String getString(int value){//Static: bunu tanımlamadan(new olarak tanımlamadan)  direk kullanabilirim
        // çünkü bu hafızanın içinde duruyor ,onun için hafızada yer kaplıyor

        return String.valueOf(value);
    }

    public static int getInteger(String value){
        return Integer.parseInt(value);
    }

    public static double getDouble(String value){
        return Double.parseDouble(value);

    }
}
