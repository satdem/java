package Gun23;

public class JavaMetod4 {
    /*public static int toplam(int a,int b){
        return a+b;
    }
    public static int toplam(int a,int b,int c){
        return a+b+c;
    }
    public static int toplam(int a,int b,int c,int d){
        return a+b+c+d;
    }*/
    //yukarıdakilerin yerine aşağıdakini kullanabilim. pratik hale gelmiş oldu
    public static int toplam(int...sayilar){//sayıların hepsini dizi halinde getirir
        int toplam=0;
        for (int i = 0; i< sayilar.length ; i++) {
            toplam+=sayilar[i];

        }
        return toplam;
    }
    public static double toplam(double... sayilar)//sayıların hepsini dizi halinde getirir
    {
        double toplam=0;

        for(int i=0;i<sayilar.length;i++)
        {
            toplam +=sayilar[i];
        }

        return toplam;
    }

    public static void main(String[] args) {
        int s1=4;
        int s2=56;
        int s3=78;
        int s4=54;
        int sonuc1=s1+s2;
        int sonuc2=s1+s2+s3;
        int sonuc3=s1+s2+s3+s4;
        System.out.println("sonuc3 = " + sonuc3);
        System.out.println("sonuc2 = " + sonuc2);

    }
}
