package Gun32.example.Ex1;

public class Ex1 {
    // 1. ADIM :person isimli bir class yazınız: name, surname, age,; olsun
    // 2. ADIM :main de 2tane bu sınıftan nesne oluşturup değer atayınız
    // 3. ADIM :getBirthYear isminde bir persona ait bir metod yazınız,
    // çalıştığında kişinin doğum tarihini versin
    // 4. ADIM :getInitials isminde kişinin isminin ilk harfi soyadınınilk harfini (büyük harfle)
    //bir metod yazınız
    public static void main(String[] args) {
        Person kisi1=new Person();
        kisi1.name="Yusuf";
        kisi1.surname="Yılmaz";
        kisi1.age=35;
        //yazdırmak için 1.yöntem oldukça uğraştırıcı
        System.out.println("kisi1.name = " + kisi1.name);
        System.out.println("kisi1.surname = " + kisi1.surname);
        System.out.println("kisi1.age = " + kisi1.age);

        Person kisi2=new Person();
        kisi2.name="Ayşe";
        kisi2.surname="Demir";
        kisi2.age=30;
       //1. yolda her person için tek tek bu yolu kullanmalıyız oldukça uzun
        System.out.println("kisi2.name = " + kisi2.name);
        System.out.println("kisi2.surname = " + kisi2.surname);
        System.out.println("kisi2.age = " + kisi2.age);

  //yazdırmanın 2. yolu
        BilgiYazdır(kisi1);
        BilgiYazdır(kisi2);
  //yazdırmanın3. yolu
  kisi1.BilgiYazdır();
  kisi2.BilgiYazdır();

        System.out.println("kisi1 doğum yılı = " + kisi1.getBirthYear());
        System.out.println("kisi2 doğum yılı = " + kisi2.getBirthYear());
        System.out.println("kisi1 in baş harfleri = " + kisi1.getInitials());
        System.out.println("kisi2 nin baş harfleri = " + kisi2.getInitials());

    }
    //***2. yöntem******yazdırmak için metod kullandık ama daha kısa bir yolu var!
    public static void BilgiYazdır(Person kisi){
        System.out.println("kisi.name = " + kisi.name);
        System.out.println("kisi.surname = " + kisi.surname);
        System.out.println("kisi.age = " + kisi.age);

    }

}
class Person{
    //fields,attributes,properties
    String name;
    String surname;
    int age;

    //******3.YÖNTEM*******
    void BilgiYazdır(){
        System.out.println("kisi.name = " + name);
        System.out.println("kisi.surname = " + surname);
        System.out.println("kisi.age = " + age);
    }
    int getBirthYear(){
        return 2020-age;
    }
    String getInitials(){
        return name.toUpperCase().charAt(0)+". "+surname.toUpperCase().charAt(0)+".";

    }

}