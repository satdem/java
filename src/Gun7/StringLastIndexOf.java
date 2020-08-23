package Gun7;

public class StringLastIndexOf {
    public static void main(String[] args) {
        //string içinde aranan karakterlerin sondan itibaren indexini verir.
        //indexof un sondan olan hali fakat index numaraları değişmez.
        String text="Good";
        System.out.println("En sondaki o nun indexi = " + text.lastIndexOf("o"));
        System.out.println("En baştaki o nun indexi = " + text.indexOf("o"));

        String text2="ankara";
        System.out.println("En sondaki a nın indexi = " + text2.lastIndexOf("a"));
        System.out.println("En baştaki a nın indexi = " + text2.indexOf("a"));


    }
}
