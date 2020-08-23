package Gun39.JavaEnum.Ex2;

public class Ex2Main {
    public static void main(String[] args) {

//        User kullanici=new User();
//        kullanici.name="Alperen";
//        kullanici.Role=1;//bu şekilde anlaşılmıyor
//        ismini yazsam daha anlaşılır olurdu
//        kullanici.Status=2;
//
//        User kullanici2=new User();
//        kullanici.name="Çiğdem";
//        kullanici.Role=1;
//        kullanici.Status=1;

            User kull1=new User();
        kull1.name="Alperen";
        kull1.yetkisi=Role.ADMIN;
        kull1.durum=Status.ACTIVE;

        User kul2=new User();
        kul2.name="Ayse";
        kul2.yetkisi=Role.COSTUMER;
        kul2.durum=Status.INACTIVE;

        if(kul2.yetkisi==Role.ADMIN){
            //silme işlemini yap
        }


        // Önceden belli olan sabit verilerin
        // atanmasındaki anlama zorluğu yerine
        // bu değerlerin karşılıkları ENUM ile
        // tanımlanarak , atama değeri için kullanılrlar.
        // Bu durum yazma ve anlama kolaylığı sağlar.

    }
}
