package Mentoring.Mentoring18Omer;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListodev {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        RandomEkleveOrtakElemanBul(a,b);

        OrtakElemanlariKaldir(a,b);
    }
    public static void RandomEkleveOrtakElemanBul(ArrayList<Integer> r,ArrayList<Integer> r2){
        for (int i = 0; i <6 ; i++) {
            r.add((int)(Math.random()*50+1));
            r2.add((int)(Math.random()*50+1));
        }
        Collections.sort(r);
        Collections.sort(r2);
        System.out.println("a ilk hali:"+r);
        System.out.println("b ilk hali:"+r2);

        int count=0;
        ArrayList<Integer> ortak=new ArrayList<>();
        for (int i = 0; i <r.size() ; i++) {
            for (int j = 0; j <r2.size() ; j++) {
                if(r.get(i)==r2.get(j))//if(r.get(i).equals(r2:get(j)) de olabilir
                    count++;
                    ortak.add(r.get(i));

            }
        }
        if(count==0) System.out.println("ortak eleman yoktur.");
        else System.out.println("ortak lelemanlar:"+ortak);
    }
    public static void OrtakElemanlariKaldir(ArrayList<Integer> r,ArrayList<Integer> r2){
        r.removeAll(r2);
        System.out.println("a nın son hali" +r);
    }

}
