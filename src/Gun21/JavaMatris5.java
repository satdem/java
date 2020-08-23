package Gun21;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMatris5 {
    public static void main(String[] args) {
       /* Bir veya daha fazla öğe iceren int array verildiğinde, arraydeki en büyük
        ve en küçük öğeler arasındaki farkı return edin.
                Not: the built-in    Math.min(v1, v2) ve   Math.max(v1, v2) methodları
        en küçük ve en büyük öğeleri return eder.

                bigDiff([10, 3, 5, 6]) → 10-3 result = 7
        bigDiff([7, 2, 10, 9]) → 10-2 result = 8
        bigDiff([2, 10, 7, 1]) → 10-1 result = 9

        return tipi  int dir
     */
        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] strArr = myStr.split(" ");

        int[] useThisArray = new int[strArr.length];

        for(int i = 0 ; i< strArr.length ; i++){

            int num =Integer.parseInt(strArr[i]);
            useThisArray[i] = num;

        }
        System.out.println(Arrays.toString(useThisArray));

        // Your code start here. Don't remove or change anything before this line.
        // Your array is -> useThisArray in line 27
        // Kodlamaya burdan başla.Bu satırdan önceki satırlarda hiçbirşeyi kaldırma ve degiştirme.
        // Kullanacağın array 27.ci satırda  --> useThisArray

        int max=useThisArray[0];
        int min=useThisArray[0];
        Arrays.sort(useThisArray);
        System.out.println(useThisArray[useThisArray.length-1] -useThisArray[0]);//son -ilk eleman





    }
}
