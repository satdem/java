package Mentoring.Mentorluk13Burak;

public class Foreach6 {
    public static void main(String[] args) {
        // TODO integer Array daki elemanlaı for each döngüsü ile toplayın

        int[] SayiArray={5,8,35,90,12};
        int toplam=0;

        for(int yeniSayi:SayiArray){
            toplam+=yeniSayi;

        }
        System.out.println("Toplam = " + toplam);
    }
}
