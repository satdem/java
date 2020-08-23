package Repl_it.methods;

public class Method13 {
    public static int minCostClimbingStairs(int[] arr){
        int [] mincost=new int[arr.length];
        mincost[0]=arr[0];
        mincost[1]=arr[1];
        for (int i = 2; i <arr.length ; i++) {
            mincost[i]=Math.min(mincost[i-1],mincost[i-2])+arr[i];
        }
        return Math.min(mincost[arr.length-2],mincost[arr.length-1]);

    }
    public static void main(String[] args) {
        /*minCostClimbingStairs  isminde bir method oluşturun.
Parametresi    int array'dir.
Return tipi  int olmalıdır.
Bir merdivende, i'inci adımda bazı negatif olmayan maliyet, cost[i] atanır (0 indeksli).
 Maliyeti ödediğinizde, bir veya iki adım tırmanabilirsiniz.
 Zeminin tepesine ulaşmak için minimum maliyeti bulmanız gerekir
 ve dizin 0 ile adımdan veya dizin 1 ile adımdan başlayabilirsiniz.
Örnek 1:
Girdi: cost = [10, 15, 20]
Çıktı: 15
Açıklama:  En ucuz  cost [1] 'de başlar, bu maliyeti öde ve en üste git.

Örnek  2:
Girdi: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Çıktı: 6
Açıklama:  En ucuz  cost[0] 'da başlar ve 1 numaralı adımda  cost[3]' ü atlar.


Not:
 maliyetin [2, 1000] aralığında bir uzunluğu olacaktır.
 Her maliyet [i], [0, 999] aralığında bir tamsayı olacaktır. */
    }
}
