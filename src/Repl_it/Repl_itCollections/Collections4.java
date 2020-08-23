package Repl_it.Repl_itCollections;

import java.util.ArrayList;

public class Collections4 {
    public static ArrayList<String> changelnArraylist(ArrayList<String> strlist, String s1, String s2){

        for(int i=0;i<strlist.size();i++){

            if(strlist.get(i).contains(s1)) {
                strlist.set(i, s2);
            }



        }return strlist;
    }

    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("yellow");
        str.add("red");
        str.add("blue");
        str.add("red");
        str.add("blue");
        String s1="blue";
        String s2="yellow";
        System.out.println(changelnArraylist(str,s1,s2));


    }

}

