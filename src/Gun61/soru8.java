package Gun61;

public class soru8 {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];

        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
        //foreach li çözüm
        for (String [] c:shirts) {
            for (String s:c) {

                System.out.print(s+":");
            }
        }
        //fori li çözüm

        //        for(int i=0;i< shirts.length ; i++)
//         {
//            for(int j=0; j< shirts[i].length;j++)
//            {
//                System.out.print(shirts[i][j]+":");
//            }
//        }

    }
}
//soru: red:blue:small:medium: çıktının bu şekilde olması için for döngüsü ne olmalı
