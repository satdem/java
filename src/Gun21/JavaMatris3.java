package Gun21;

public class JavaMatris3 {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
        //  2D arrayinden min number print et
        int[][] a= {{1,2,3}, {2,3,1} , {5,-5,5} , {2,1,3}};
        int min=a[0][0];
        for (int i = 0; i <a.length; i++) //a.length bize satır sayısını verir
        {
            for (int j = 0; j <a[i].length ; j++) //a[i].length te sütun sayısını verir
            {
                if(a[i][j]<min)
                    min=a[i][j];

            }
        }
        System.out.println("min = " + min);
    }
}


