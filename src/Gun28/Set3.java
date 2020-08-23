package Gun28;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set3 {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        hs.add("Ali");
        hs.add("Mehmet");
        hs.add("Ayşe");
        hs.add("Dilek");
        hs.add("Emir");
        System.out.println("hs = " + hs);

        Set<String> lhs=new LinkedHashSet<>();//eklenme sırasına göre yerleştirdi
        lhs.add("Ali");
        lhs.add("Mehmet");
        lhs.add("Ayşe");
        lhs.add("Dilek");
        lhs.add("Emir");
        System.out.println("lhs = " + lhs);

        Set<String> ts=new TreeSet<>();//alfabetik sıraya göre yerleştirdi
        ts.add("Ali");
        ts.add("Mehmet");
        ts.add("Ayşe");
        ts.add("Dilek");
        ts.add("Emir");
        System.out.println("ts = " + ts);
    }
}
