package Mentoring.Mentorluk6;

public class indexOf {
    public static void main(String[] args) {
       /* String str="abaacabbaab";
        System.out.println("ilk a nın indexi "+str.indexOf('a'));
        System.out.println("ikinci a nın indexi "+str.indexOf('a',1));//ilk a dan sonraki a yı gösteriyor

        System.out.println( str.indexOf('a',6));//6. karakterden sonraki a nın indexini verir.
        System.out.println(str.indexOf('b',3));*/
        String s= "Benim ismim Tahir";
        int i=s.indexOf("i",8);
        System.out.println(i);   
        char c=s.charAt(i);
        System.out.println("c = " + c);



    }
}
