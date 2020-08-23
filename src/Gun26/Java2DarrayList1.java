package Gun26;

import java.util.ArrayList;

public class Java2DarrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();//istediğimiz kadar değişken saklayabiliyorduk

        ArrayList<ArrayList<Integer>> notlarArrList=new ArrayList<>();//değişkeni arraylist olan bir arraylist
        //yani 2 boyutlu arraylist

        ArrayList<Integer> matNotlar=new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar=new ArrayList<>();
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar=new ArrayList<>();
        kimNotlar.add(45);
        kimNotlar.add(55);
        kimNotlar.add(65);
        kimNotlar.add(35);

        notlarArrList.add(matNotlar);//burada notlarArrList elemanlarını tanımladık
        notlarArrList.add(turNotlar);//elemanları arraylistler
        notlarArrList.add(kimNotlar);

        for (int i = 0; i <matNotlar.size() ; i++)//şeklinde yazdırmamız daha iyi olur.
            // çünkü toplama falan yapacağız bu daha iyi olabilir
        {
            System.out.println("Matematik notları: "+matNotlar.get(i));

        }

        System.out.println("notlarArrList uzunluğu = " + notlarArrList.size());//kaç ders var sayısını veriyor

        for (int i = 0; i <notlarArrList.size() ; i++) {

           // System.out.println("notlarArrList = " + notlarArrList.get(i));//bütün notları yazıyor

            for (int j = 0; j < notlarArrList.get(i).size(); j++) {//1. dersin notunu 2. dersin notunu...
                System.out.println(i+". dersin "+ j+". notu = " + notlarArrList.get(i).get(j));

            }
        }
        int matort=ortalama(notlarArrList,0);
        System.out.println("matort = " + matort);

        int turort=ortalama(notlarArrList,1);
        System.out.println("turort = " + turort);

        int kimort=ortalama(notlarArrList,2);
        System.out.println("kimort = " + kimort);
        System.out.println("Tüm derslerin ortalaması= "+tumdersortalama(notlarArrList));

        System.out.println("1. yazılı ort:"+yaziliortalama(notlarArrList,0));
        System.out.println("2. yazılı ort:"+yaziliortalama(notlarArrList,1));
        System.out.println("3. yazılı ort:"+yaziliortalama(notlarArrList,2));
        System.out.println("4. yazılı ort:"+yaziliortalama(notlarArrList,3));
    }
    //öyle bir metod yazın ki dersin nosuna göre ortalama bulsun
    public static int ortalama(ArrayList<ArrayList<Integer>> dn,int a){// a dersin numarası
        int top=0;
        int ort=0;

            for (int i = 0; i < dn.size(); i++) {
                top+=dn.get(a).get(i);

            }ort=top/dn.get(a).size();
       return ort;
    }
    //tüm derslerin ortalamasını bulsun
    public static double tumdersortalama(ArrayList<ArrayList<Integer>> dn){
       double tumort=0;
       int top=0;
       int count=0;
        for (int i = 0; i <dn.size() ; i++) {
            for (int j = 0; j <dn.get(i).size() ; j++) {
                top+=dn.get(i).get(j);
               count++;
            }

        }tumort=top/count;

     return tumort;
    }
    //öyle bir metod yazın ki mesela birinci sınavın ortalamasını bulsun
    //yani tüm derslerdeki birinci yazılının ortalmasını bulsun
    public static double yaziliortalama(ArrayList<ArrayList<Integer>> dn,int a){
        double yazort=0;
        int top=0;
        int count=0;
        for (int i = 0; i <dn.size() ; i++) {

            top+=dn.get(i).get(a);
             count++;

        }
        yazort=top/count;

  return yazort;
    }
    //ödev kimya 4. sınav ortalması nasıl bulunacak
    //Recursive(ÖzYinemeli metodlar) konusu gooogle dan araştırılacak.
}
