package Gun13;

import java.util.Scanner;

public class switch6 {
    public static void main(String[] args) {
        //girilen bir ay numarasına göre ,ayın kaç gün olduğunu yzdırın
        Scanner oku=new Scanner(System.in);
        System.out.print("Ay numarası:");
        int a=oku.nextInt();

     /*   switch (a){
            case 1: System.out.println("31");break;
            case 2: System.out.println("28");break;
            case 3: System.out.println("31");break;
            case 4: System.out.println("30");break;
            case 5: System.out.println("31");break;
            case 6: System.out.println("30");break;
            case 7: System.out.println("31");break;
            case 8: System.out.println("31");break;
            case 9: System.out.println("30");break;
            case 10: System.out.println("31");break;
            case 11: System.out.println("30");break;
            case 12: System.out.println("31");break;
            default:
                System.out.println("hatalı no");*/
                switch (a){ //ikinci yol.
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:System.out.println("31");break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("30");break;
            case 2:
                System.out.print("yılı giriniz:");
              int yil=oku.nextInt();
              if(yil%4==0)
                    System.out.println("29");
                  else
                      System.out.println("28");break;
                  default:
                        System.out.println("hatalı sayı");



        }
    }
}
