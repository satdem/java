package Mentoring.Mentoring20Zeynep;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetNedir {
    public static void main(String[] args) {
        //HASHSET
        HashSet<String> set=new HashSet<>();
        set.add("Kaplan");
        set.add("aslan");
        set.add("zurafa");
        set.add("fil");
        set.add("kedi");
        set.add("kedi");
        System.out.println(set);
        System.out.println("*********************************");

        TreeSet<String> tree=new TreeSet<>();
        tree.add("Kaplan");
        tree.add("aslan");
        tree.add("zurafa");
        tree.add("fil");
        tree.add("kedi");
        tree.add("kedi");
        System.out.println(tree);
        System.out.println("*************************************");

        LinkedHashSet<String> link=new LinkedHashSet<>();
        link.add("Kaplan");
        link.add("aslan");
        link.add("zurafa");
        link.add("fil");
        link.add("kedi");
        link.add("kedi");
        System.out.println(link);


    }
}
