package Repl_it.methods;

import java.util.Arrays;

public class metod8 {
    /*nextGreaterElement isminde bir method oluşturun.
Parametre olarak iki int array'i kabul eder.

Size int nums1 adında bir int array verilir ve bunun altkümesi olarak da nums2 array verilir.

nums2 array'indeki nums1 ögelerini arayın ve ortak olan ögeden sonra gelen numaranın,
 nums2 array'inde bulunan sayıdan büyük olup olmadığını kontrol edin.
 Eğer öyle ise, bu sayının yerini nums2 deki büyük sayı ile değiştirin.
 nums2 array'inde, bulunan sayıdan sonra gelen başka bir sayı yoksa, o yer için -1 koyun.

Örnek ile daha iyi anlayacaksınız.
 Example 1:
Girdi: nums1 = [4,1,2], nums2 = [1,3,4,2]
Çıktı:[-1,3,-1]
Açıklama:
İlk dizedeki 4 sayısı için, ikinci dizede (array'deki) bir sonraki büyük sayı yoktur, bu nedenle -1 yazılır.
İlk dizedeki 1 sayısı için, ikinci dizede 1'den sonra gelen büyük sayı 3 tür.
İlk dizedeki 2 sayısı için, ikinci dizede 2'den sonra gelen büyük bir sayı yoktur, bu nedenle -1 yazılır.
Cevap:[-1,3,-1]

 Example 2:
Girdi: nums1 = [2,4], nums2 = [1,2,3,4].
Çıktı: [3,-1]
Açıklama:
  İlk dizedeki 2 sayısı için, ikinci dizede 2'den büyük olarak 3 gelmektedir. Bu nedenle 3 'tür.
  İlk dizedeki 4 sayısı için, ikinci dizede 4'ten sonra hiçbir sayı gelmediği için, -1 yazılır.
Cevap : [3,-1]
Not:
Sayı1 ve sayı2'deki tüm öğeler benzersizdir.*/
    public static int[] nextGreaterElement(int[] a,int[] b){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length-1 ; j++) {
                if(a[i]==b[j] && b[j+1]>a[i]){
                    a[i]=b[j+1];
                     break;
                }
                else if(a[i]==b[j] && b[j+1]<a[i]){
                    a[i]=-1;

                }
                else if(a[i]==b[j+1] && b[j+1]==b[b.length-1]){
                    a[i]=-1;
                }

            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] num1={4,1,2};
        int[] num2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(num1,num2)));
    }
}
