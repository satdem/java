package Mentoring.Mentoring16Burak;

public class MetodOverloading1 {
    public static void main(String[] args) {
        //TODO Method Pverloading-------Metoda aşırı yükleme
        toplama(1,3,7,8,48);
        toplama(1,7,8,9);
        toplama(5,7,8);
        toplama(1,8);

    }
    public static void toplama(int a,int b,int c,int d,int e){
        System.out.println("toplama sonucu: "+(a+b+c+d+e));
    }
    public static void toplama(int a,int b,int c,int d){
        System.out.println("toplama sonucu: "+(a+b+c+d));
    }
    public static void toplama(int a,int b,int c){
        System.out.println("toplama sonucu: "+(a+b+c));
    }
    public static void toplama(int a,int b){
        System.out.println("toplama sonucu: "+(a+b));
    }
}
