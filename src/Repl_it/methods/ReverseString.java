package Repl_it.methods;

import java.util.ArrayList;

public class ReverseString {
    public static String textduzenlem(String str){
        String newStr="";
        str.trim();
        str.replaceAll("[ ]+", " ");//bütün boşluklar yerine bir tane boşluk yazar.
        newStr= str;
        return newStr;
    }

    public static String reverseStr(String str){
        String strRev="";
        for (int i = 0; i < str.length(); i++) {
            strRev+=str.charAt(str.length()-1-i);

        }return strRev;
    }
    public static void main(String[] args) {
        String a="ah yalan dünya";
        System.out.println(reverseStr(a));

    }

}
