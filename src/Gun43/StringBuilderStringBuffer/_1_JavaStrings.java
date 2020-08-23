package Gun43.StringBuilderStringBuffer;

import java.util.Arrays;

public class _1_JavaStrings {
    public static void main(String[] args) {
        //eğer çok fazla string işlemleri yapacaksak bunun için performansı oldukça iyi olan stringbuilder kullanılır.
        //yapısı gereği hızlı çalışır ama paralel çalışan işlemlerde güvenli değil.bu durumda stringbuffer kullanılır
        //en hızlısı stringbuilder sonra stringbuffer enson string dir.string en yavaşı

        StringBuilder s=new StringBuilder("Bu");//başlangıçta eleman atadık boş da bırakabilirdik
        s.append("gün");//append eleman eklıyor. add gibi atmaya ihtiyaç yok
        s.append(" hava");
        s.append(" çok sıcak");

        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(4);//ne verirsen ver stringe çeviriyor

        s.reverse();//direk tersine çeviriyor.atamaya ihtiyaç yok
        System.out.println("s = " + s);

        s.delete(0,5);//0-5 arasını sil, 5 dahil değil
        System.out.println("s = " + s);

        s.deleteCharAt(3);//3. indexteki elemanı siliyor
        System.out.println("s = " + s);

        System.out.println("s.capacity() = " + s.capacity());//hafızada genişleyebilmesi için ayrılan alan,
        // eklendiklçe artıyor.tampon genişleyebilme alanı
        System.out.println("s.length() = " + s.length());//bu stringin uzunluğu
        
        s.insert(5,"545");//5 nolu indexe 545 eklledi(insert yaptı)insert: araya girme
        System.out.println("s = " + s);
        s.insert(4,3.657);
        System.out.println("s = " + s);

        int[] dizi={2,3,4,5,6};
        s.insert(6, Arrays.toString(dizi));//diziyi ekledik
        System.out.println("s = " + s);

        s=new StringBuilder("Bugünhavaçoksıcak");
        System.out.println("s = " + s);
        s.replace(3,8,"ben");//3 ve 8 arasını ben ile değiştirdi,8 hariç
        System.out.println("s = " + s);

        
    }
}
