package Gun38.nonAccessModifier.finalModifier.example2;

public class persons {
    public static void main(String[] args) {
        Person kisi1=new Person("İsmet",12);
        //kisi1.fingerprintCode=12;// değiştiremem çünkü final
        //ilk değeri aldı
        System.out.println("kisi1 = " + kisi1);
        
        Person kisi2=new Person("Ahmet",15);
        //kisi2.fingerprintCode=17; değiştiremem 
        System.out.println("kisi2 = " + kisi2);
        
    }
}
