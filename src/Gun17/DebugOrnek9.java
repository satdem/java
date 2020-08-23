package Gun17;

public class DebugOrnek9 {
    public static void main(String[] args) {
        int a=10;//kırmızı nokta breakpoint demek. burada duraklıyor buradan sonrasını fn+ f8 ile çalıştırıyor
                 //böylece adım adım satırlar takip edilebilir
                 //breakpoint i istediğin yere koyabilirsin
                 //çalıştırırken debugrun ile çalıştırıyoruz
        a=1000;

        a+=100;

        a*=10;
        System.out.println("a = " + a);

    }

}
