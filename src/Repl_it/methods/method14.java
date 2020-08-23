package Repl_it.methods;

import java.util.Arrays;

public class method14 {
   /* append adında bir method oluşturun.

    Parametre olarak iki int array  oluşturun.

    ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.


            Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,

    Bunu döndürmelidir:
    {2, 4, 6, 1, 2, 3, 4, 5}.*/
   public static int[] append(int[] a,int[] b){
       int[] ab=new int[a.length+b.length];

       for (int j = 0; j< a.length+b.length ; j++) {
           for (int i = 0; i <a.length ; i++) {

               ab[i]=a[i];
           }

           for (int k = 0; k <b.length ; k++) {

                   ab[a.length+k]=b[k];
               }

       }

       return ab;
   }

   public static void main(String[] args) {
       int[] arr1={2, 4, 6};
       int[] arr2={1, 2, 3, 4, 5};
       System.out.println(Arrays.toString(append(arr1,arr2)));

   }

}
