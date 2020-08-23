package Gun28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet2 {
    public static void main(String[] args) {
        //RemoveAll,RetainAll,AddAll
        Set<Integer> hs1=new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> hs2=new HashSet<>(Arrays.asList(4,5,6,7,8));
        
        //retainAll: kesişim demek
        Set<Integer> hskesisim=new HashSet<>(hs1);//hs1 den kopya oluşturduk
        hskesisim.retainAll(hs2);//hs1 ve hs2 nin kesişimi bulundu
        System.out.println("hskesisim = " + hskesisim);

        //removeAll: hs1 in hs2 den farkını bulur
        Set<Integer> hsFark=new HashSet<>();
        hsFark.addAll(hs1);//kopya nın ikinci yolu
        hsFark.removeAll(hs2);
        System.out.println("hsFark = " + hsFark);


    }
}
