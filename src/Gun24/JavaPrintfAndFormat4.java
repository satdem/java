package Gun24;

public class JavaPrintfAndFormat4 {
    public static void main(String[] args) {
        int a=120;
        double oran=0.2567897543;
        String str;
        System.out.println("a = " + a);
        System.out.println("oran = " + oran);

        //Formatlı yazdırmalar: Format ve printf
        //tam sayılar için d
        //ondalıklı sayılar için f kullanılır

        str=String.format("a=%d oran=%f ",a,oran);
        System.out.println(str);
        System.out.println("a="+a+" oran="+oran);//bu şekilde yazdırabilirim ama yuvarlama yaptıramam

        System.out.printf("2. a=%d oran=%f,pi=%f\n ",a,oran,Math.PI);
        System.out.printf("3. a=%10d oran=%f\n ",a,oran);//10d 10 hane kullan demek
        System.out.printf("4. a=%-10d oran=%f\n ",a,oran);//-10d sola dayalı 10 hane kullan
        System.out.printf("5. a=%010d oran=%f\n ",a,oran);//010d 10 hane kulan boş haneler 0 olsun demek

        System.out.printf("6. a=%d oran=%.3f\n ",a,oran);//noktadan sonra 3 hane kullan
        System.out.printf("7. a=%d oran=%.9f\n ",a,oran);//noktadan sonra 9hane kullan
        System.out.printf("8. a=%d oran=%6.1f\n ",a,oran);//6 hane kullan bir tanesi noktadan sonra olsun
        System.out.printf("9. a=%d oran=%06.1f\n ",a,oran);//6 hane kullan bir tanesi noktadan sonra olsun boş yerler de 0

    }

}
