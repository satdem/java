package Gun21;

public class JavaMatris2 {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et

        int[][] a={{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
       int max=a[0][0];
        for (int i = 0; i <a.length; i++) //a.length bize satır sayısını verir
        {
            for (int j = 0; j <a[i].length ; j++) //a[i].length te sütun sayısını verir
            {
                if(a[i][j]>max)
                    max=a[i][j];

            }
        }
        System.out.println("max = " + max);
    }
}
