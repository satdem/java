package Repl_it.Repl_itCollections;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist5 {

/*   rotateList() isminde bir method oluşturun.

    Parametre olarak String ArrayList





    ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)

    Tersten yazılmış halini return edin.



            Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"

    cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"*/
public static ArrayList<String> rotateList(ArrayList<String> arrl){
    Collections.reverse(arrl);

    return arrl;
}

    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("New jersey");
        a.add("New york");
        a.add("Atlanta");
        a.add("Florida");
        a.add("Ohio");
        System.out.println( rotateList(a));
    }


}
