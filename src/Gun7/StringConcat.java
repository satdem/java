package Gun7;

public class StringConcat {

    public static void main(String[] args) {
        //bir stringe diğerini ekler.

        String s="Hi";
        System.out.println(s+" there!");
        System.out.println(s.concat(" there!"));

        String s2="everybody";
        System.out.println(s.concat(s2));
        System.out.println("s = " + s);

        s=s.concat(s2);//değişkenin kendisine atamam gerekiyor değişmesi için. s+s2 ile aynı işlemi yapar.
        System.out.println("s = " + s);

    }
}
