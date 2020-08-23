package Gun21;

public class JavaMatris6 {
    public static void main(String[] args) {
        //TODO Düzensiz 2D arrays(2 boyutlu diziler)

        int[][] duzensiz2D={
                {0,1,2},
                {3,4},
                {5,6,7,8,9,10},
                {11,12,13,14,15}
        };
        System.out.println("0. satırdaki sutun sayısı= "+duzensiz2D[0].length);
        System.out.println("1. satırdaki sutun sayısı= "+duzensiz2D[1].length);
        System.out.println("2. satırdaki sutun sayısı= "+duzensiz2D[2].length);
        System.out.println("3. satırdaki sutun sayısı= "+duzensiz2D[3].length);

        for(int i=0;i<duzensiz2D.length;i++){
            for (int j = 0; j <duzensiz2D[i].length ; j++) {
                System.out.print(duzensiz2D[i][j]+" ");
            }
            System.out.println();
        }

    }
}
