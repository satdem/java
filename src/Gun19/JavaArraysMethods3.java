package Gun19;

import java.util.Arrays;

public class JavaArraysMethods3 {
    public static void main(String[] args) {
        //Arrays.toString dizinin tüm elemanlarını yazdırır
        String[] names=new String[]{"ahmet","ayse","kaya","deniz"};

        System.out.println(".toString(names) = " + Arrays.toString(names));

        //Arrays.sort alfabetik sıra yada küçükten büyüğe sıralar
        Arrays.sort(names);
        System.out.println(".sort = " + Arrays.toString(names));

        //Arrays.equals(array1,array2)  bütünelemanların
        // sırası ile aynı olup lmadığını kontrol eder.
        int [] a={1,2,3};
        int [] b={1,2,3};
        int [] c={3,2,1};

        System.out.println("a==b "+Arrays.equals(a,b));//true
        System.out.println("a==c "+Arrays.equals(a,c));//false

        //Arrays.fill(array,value) bütün elemanlara value değeri atar
        int[] number=new int[5];
        System.out.println("atanmadan önce :"+Arrays.toString(number));
        Arrays.fill(number,7);
        System.out.println("atanmadan sonra :"+Arrays.toString(number));

        //Arrays.binarySearch(array,value) sıralı bir dizide aranan
        // bir değer varsa indexini verir yoksa - değer döndürür

        int[] rakam={1,8,7,3,2};
        System.out.println("sıralamadan önce: "+Arrays.binarySearch(rakam,8));
        Arrays.sort(rakam);
        System.out.println("sıralamadan sonra: "+Arrays.binarySearch(rakam,8));
    }
}
