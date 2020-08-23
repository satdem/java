package Gun18;

public class JavaArray2 {
    public static void main(String[] args) {
        //diziler aşağıdaki şekillerde tanımlanabilir
        int[] dizi1=new int[5];//5 adet 0,1,2,3,4 indexli boş eleman oluşturuldu
        int[] dizi2={5,77,3,789,55,6,7,0,-34,6};//eleman sayısı kadar uzunlukta dizi tanımlandı
        String[] dizi3=new String[5];//string tipinde boş elemanlı dizi tanımlandı
        boolean[] dizi4=new boolean[3];//boolean tipinde default değerli dizi tanımlandı
        double[] dizi5=new double[6];//6 elemanlı double dizi tanımlandı

        for(int i=0;i<dizi1.length;i++)
            System.out.println("dizi1 (int) = " + dizi1[i]);//0,0,0,0,0

        for(int i=0;i<dizi2.length;i++)
            System.out.println("dizi2 (int)= " + dizi2[i]);//5,77,3,789,55,6,7,0,-34,6

        for(int i=0;i<dizi3.length;i++)
            System.out.println("dizi3 (String)= " + dizi3[i]);//null,null,null,null,null,null

        for(int i=0;i<dizi4.length;i++)
            System.out.println("dizi4 (boolean)= " + dizi4[i]);//false,false,false

        for(int i=0;i<dizi5.length;i++)
            System.out.println("dizi5 (double)= " + dizi5[i]);//0.0,0.0,0.0,0.0,0.0,0.0,

    }
}
