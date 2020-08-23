package Gun37.instansceModifiers.defaultModifier.same;

public class BookStore {
    public static void main(String[] args) {
        //aynı paketin içinde olduğundan default aulaşabildik
        Book kitap1=new Book();
        kitap1.name="Lord of the Rings";

        //zarten public sınır yok
        Book kitap2=new Book("kar");

    }
}
