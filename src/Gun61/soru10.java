package Gun61;

public class soru10 {
    public static void main(String[] args) {
        int n [][] = {{1,3}, {2,4}};

        for(int i = n.length -1; i >= 0; i--){

            for(int y : n[i]){//önce 1. satır sonra 0. satırı yazıyor

                System.out.print(y);
            }
        }

    }
}
//2413