package Gun37.instansceModifiers.publicModifier.same;

public class ChromeBrowser {
    public static void main(String[] args) {
        //public olduğu için buradan ulaşabildim
        SearchEngine google=new SearchEngine("crome");
        google.name="Crome";//public

        System.out.println("google = " + google);
        //toString metoduna gider oda public
    }
}
