package Repl_it.methods;

public class Method11 {
    public static void main(String[] args) {
        int a=1119;
        System.out.println(addDigits(a));
    }
    /*
addDigits isminde bir method oluşturun.
Parametresi int
Return tipi de int
Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
Tek basamaklı çıktığında, döndürün
Örnek1:
Girdi 38
Çıktı: 2
Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
             2 , tek basamaklı olduğundan, bunu döndürün.*/
    public static int addDigits(int i){
    do {
    String str = String.valueOf(i);
    String[] astr = str.split("");

    int[] istr = new int[astr.length];
    int t = 0;
    for (int j = 0; j < astr.length; j++) {
        istr[j] = Integer.parseInt(astr[j]);
        t += istr[j];
        i = t;
    }
    }while (i>=10);
        return i;
    }
}
