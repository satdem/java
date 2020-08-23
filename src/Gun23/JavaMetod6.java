package Gun23;

public class JavaMetod6 {
    public static void ortalamBulYaz(String isim,int...notlar){

        int toplam=0;
        int ort=0;
       /* for(int not:notlar){
            toplam+=not;
        }*/  //ya da foreach kullanabilirim
        for (int i = 0; i <notlar.length ; i++) {
            toplam+=notlar[i];
            ort=toplam/notlar.length;
        }
        System.out.println(isim+"="+ort);
    }
    public static void main(String[] args) {
        ortalamBulYaz("Ali",60,80,85,95,100,60);
        ortalamBulYaz("Mehmet",60,75,55,90);
        ortalamBulYaz("Ayşe",65,70,75);
        ortalamBulYaz("Ömer",60,80,85,95,60);

    }
}
