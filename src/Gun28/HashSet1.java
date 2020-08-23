package Gun28;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        //setlerde tekrarlayan eleman yok . çünkü kabul etmiyor

        HashSet<Integer> hs1=new HashSet<Integer>();//sadece int alan bir set
        Set<Integer> hs2=new HashSet<Integer>();//sadece int alan bir set tanımladım

        Set<Integer> hs3=new HashSet<>();//sadece int alan bir set tanımladım. önerilen yöntem bu

        Set hsObject=new HashSet();//bu tanımlamada her türlü değişken atanabilir,bütün tipler.
        //bütün tipleri kapsayan tipin adı:Object->Nesne->herşeyin atamsı
        //bu tanımlama yavaş çalışır
        //ttarsız olabilirler,biraz kontrol dışı olabiliyor
        //Zorunludeğilsen kullanma!!
        hsObject.add("12");
        hsObject.add(12);

        Set<Integer> hs=new HashSet<>();//sadece int alan bir set tanımladım. önerilen yöntem bu
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);
        hs.add(5);
        hs.add(7);
        //1.YÖNTEM YAZDIRMA
        System.out.println("hs = " + hs);//hs = [1, 34, 3, 5, 7]
        //**********HASHSET*******
        //1-Sırası neden böyle: Hızlı çalışmak için belli bir(hash) algoritmaya göre sıraladı
        //2-iknci eklenen elemanları neden almadı: tekrarlananları kabul etmiyor

        //2.YÖNTEM YAZDIRMA elemanlara tek tek ulaşıyoruz
        for (Integer sayi:hs) {
            System.out.println("sayi = " + sayi);

        }
        //3.YÖNTEM YAZDIRMA  'Iterator'
        Iterator it=hs.iterator();
        while (it.hasNext()){
            Integer eleman=(Integer) it.next();//ıteratorun gödterdiği elemanı belirtir(Integer yazmam daha iyi artık)
            //if(eleman==34)
            //it.remove();   burada silme işlemi yapabiliyorum
            System.out.println("it: eleman = " + eleman);
        }

        hs.remove(5);
        if(hs.contains(5)){
            System.out.println("5 var");
        }else System.out.println("5 yok");//burası çalıştı çünkü silmiştik
        System.out.println("remove sonrası hs = " + hs);

        hs.clear();
        System.out.println("clear sonrası hs = " + hs);
    }
}
