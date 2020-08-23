package Gun36.Tasks.Task1;

public class Task1 {
    //bir book classı yazınız .fields: name,publishYear,autor.
    //3 adet constructor ekleyin
    //kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyin
    //3 adet kitap yazdırın mainde
    public static void main(String[] args) {
        Book kitap1=new Book("Ask ve gurur",1976,"jane Austen");
        kitap1.showInfo();
        Book kitap2=new Book("Herry porter",1999);
        kitap2.showInfo();
        Book kitap3=new Book("ikinci şans");
        kitap3.showInfo();

        System.out.println("kitap3 = " + kitap3);
        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap2 = " + kitap2);
        System.out.println(kitap1.toString());//aslında bunu yapıyor


    }


}
