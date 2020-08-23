package Repl_it.methods;

import java.util.ArrayList;

public class method5 {
    public static int getSum(ArrayList<String> a){
        ArrayList<Integer> ia=new ArrayList<Integer>();
        int toplam=0;
        int sonuc=0;
        for(int i=0;i<a.size();i++){
            //a.get(i)=a.get(i).replaceAll("[$]","");
            ia.add(Integer.parseInt(a.get(i).replaceAll("[$]","")));
            toplam+=ia.get(i);
        }
        if(toplam>=0) sonuc= toplam;
        else sonuc=-1;
        return sonuc;

    }
}
