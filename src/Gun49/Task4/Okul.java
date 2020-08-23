package Gun49.Task4;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo=new LiseOgrencisi("Ahmet","Lise");
        LiseOgrencisi lo2=new LiseOgrencisi("Ali","Lise");
        
        IlkOgrencisi io1=new IlkOgrencisi("Ayşe","ilk");
        IlkOgrencisi io2=new IlkOgrencisi("Mehmet","ilk");

        System.out.println("lo = " + lo);
        System.out.println("lo2 = " + lo2);
        System.out.println("io1 = " + io1);
        System.out.println("io2 = " + io2);
        
    }
}
