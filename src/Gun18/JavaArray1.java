package Gun18;

public class JavaArray1 {
    public static void main(String[] args) {
        int[] dizi1=new int[5];//0,1,2,3,4 indexli 5elemanlı sayı dizisi

        System.out.println("dizi1.length"+ dizi1.length);

        for(int i=0;i<dizi1.length;i++ ){
            System.out.println("Diziznin "+i+". elemanı "+dizi1[i]);//dizi1[i] i indexli dizinin değerini verir.
        }
        System.out.println(dizi1[5]);//burada hata verir çünkü diziznin indexi aşıldı
                                    // "ArrayIndexOutOfBoundsException:" yazar

    } //baştan değer atanmazsa bütün dizi değerlerini "0" verir.
}
