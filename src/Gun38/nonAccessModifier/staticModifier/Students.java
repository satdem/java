package Gun38.nonAccessModifier.staticModifier;

public class Students {

    public static void main(String[] args) {
        Student ogr1=new Student("Ali","Yılmaz");
        Student ogre=new Student("Sadi","Yıldırım");
        Student ogr3=new Student("Deniz","Kaynak");
        //...
        //...
        //...
        Student ogrenci=new Student("Malik","Demir");

        System.out.println("Student.ogrenciSayisi = " + Student.ogrenciSayisi);

        System.out.println("ogrenci = " + ogrenci);
        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogre = " + ogre);
        System.out.println("ogr3 = " + ogr3);
    }
}
//static anahtarının üç adet kullanım amacı var
//1. metoda vefielda direk class üzerinden ulaşım
//2. tekrarlanan değerler için hafızayı iyi kullanma
//3.oluşturulan nesneler için sayaç görevi için de kullanılır.