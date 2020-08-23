package Gun49.Task1;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen dd=new Dikdortgen(4,5);
        System.out.println("Dikdörtgen = " + dd);

        Kare kare=new Kare(6);
        System.out.println("kare = " + kare);

        Cember cember=new Cember(3);
        System.out.println("cember = " + cember);

        System.out.println("cember.getAlan() = " + cember.getAlan());
        



    }
}
