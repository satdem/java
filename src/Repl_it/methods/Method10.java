package Repl_it.methods;

public class Method10 {
    public static void main(String[] args) {
        int n=7;
        System.out.println(fib(n));
    }

    /*ismi fib olan bir method oluşturun.
Bu methos bir int değer kabul etsin.
Return int olmalı.
Örnek 1:
Yaygın olarak F (n) olarak gösterilen Fibonacci sayıları, Fibonacci sekansı adı verilen bir sekans oluşturur,
 böylece her sayı, 0 ve 1'den başlayarak önceki iki numaranın toplamıdır.
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.

Verilen N, değerleri hesaplayın,F(N).e1:
Örnek 1:
Girdi: 2
Çıktı: 1
Açıklama: F(2) = F(1) + F(0) = 1 + 0 = 1.

Örnek2:
Girdi: 3
Çıktı: 2
Açıklama: F(3) = F(2) + F(1) = 1 + 1 = 2.

Örnek 3:
Girdi: 4
Çıktı: 3
Açıklama:F(4) = F(3) + F(2) = 2 + 1 = 3.*/
    public static int fib(int n){
        int f=0;
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 0; i < n-1; i++) {

            arr[i+2]=arr[i]+arr[i+1];


        }
        f=arr[n];
        return f;
    }
}
