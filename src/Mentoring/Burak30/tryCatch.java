package Mentoring.Burak30;

public class tryCatch {
    public static void main(String[] args) {
        //todo tryCatch
        System.out.println("1. adım: baslangıç");
        int a=0;

        try{
        int b=5/a;
        System.out.println("2.adım:Hata sonrası");
        System.out.println("a = " + a);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("3.adım :kod bitiş");
    }
}
