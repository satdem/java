package Gun27;

public class ornek {
    public static void main(String[] args) {
        //bir dizideki tekrarlanan sayıların kaç kez tekrarladığını yazdırınız
        int[] dizi=new int[]{1,2,3,3,3,4,4,4,5,5,57,8,9};
        for (int i = 0; i <dizi.length ; i++) {
            int miktar=0;

            for (int j = 0; j <dizi.length ; j++) {
                if(dizi[i]==dizi[j]){
                    miktar++;
                }
            }
            if(miktar>1){
                System.out.println(dizi[i]+" sayısı "+miktar+" kez tekrar ediyor.");
            }

        }
    }
}
