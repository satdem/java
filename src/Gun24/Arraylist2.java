package Gun24;

import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {//tanımlama şekilleri 1. yol
        ArrayList<String> list1=new ArrayList<>(){
            {
                add("Almanca");
                add("ingilizce");
                add("Türkçe");
                add("Rusça");
            }
        };
        //Tanımlama şekilleri 2. yol
        System.out.println("list1 = " + list1);
       
        ArrayList<String> list2=new ArrayList<>();
        list2.add("Rusça");
        list2.add("Türkçe");
        list2.add("Arapça");
        System.out.println("list2 = " + list2);

        list1.removeAll(list2);//list1 deki list2 elemanlarını sildi
        System.out.println("list1 = " + list1);

        //.addAll*****parantz içindeki listeyi ilkine ekler*****
        list1.addAll(list2);
        System.out.println("list1= "+list1);

        //eklenecek listeyi belirtilen indexten itibaren ekler
        list1.addAll(2,list2);
        System.out.println("list1 = " + list1);

        //.contains     *****içinde bir eleman var mı yok mu diye kontrol eder******
        if(list1.contains("Türkçe")){
            System.out.println("Türkçe dili var");
        }

        //indexOf   lastIndexOf toArray var aynı dizilerdeki gibi


    }

}
