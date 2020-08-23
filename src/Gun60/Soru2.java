package Gun60;

public class Soru2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int i=0;
        do {
            System.out.print(arr[i]+" ");// 5 sınır olmuş oluyor yani
            // 4 nolu indexteki elemanı yazmaya çalışıyor
            i++;
        }while (i < arr.length + 1 );
    }
}
