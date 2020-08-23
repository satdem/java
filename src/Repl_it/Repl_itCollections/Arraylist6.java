package Repl_it.Repl_itCollections;

import java.util.ArrayList;

public class Arraylist6 {/*hillNum() isminde bir method oluşturun.

Parametre olarak Integer ArrayList
Return tipi int,
Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
Örneğin;
ArrayList  5,4,6,2,1
2, 6'dan küçük ve 1 den büyüktür.

Return 2 olmalı.*/
    public static int hillNum(ArrayList<Integer> arrl){
        int a=0;
        for(int i=1;i<arrl.size()-1;i++){
            if(arrl.get(i)<arrl.get(i-1) && arrl.get(i)>arrl.get(i+1)){
                a=arrl.get(i);
            }

        }return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intarr=new ArrayList<>();
        intarr.add(5);
        intarr.add(4);
        intarr.add(6);
        intarr.add(2);
        intarr.add(1);
        System.out.println(" istenen sayı= " +hillNum(intarr));
    }

}
