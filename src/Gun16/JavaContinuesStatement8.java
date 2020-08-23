package Gun16;

import java.util.Scanner;

public class JavaContinuesStatement8 {
    public static void main(String[] args) {
        //kullanıcıdan 5 tane sayıisteyin.
        //bu sayılardan 5 ile 10 arasındakiler hariç diğerlerinin toplamını bulunuz 
        //bunu continue ile çözün
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for(int i=1;i<=5;i++){
            System.out.print("bir sayı giriniz: ");
            int a=oku.nextInt();

            if(a>5 && a<10)
            {System.out.println("girdiğiniz sayı 5 ile 10 arasında olduğu için toplanmayacak");
            continue;}

            toplam=toplam+a;//else koysamda olurdu
        }
        System.out.println("toplam = " + toplam);
    }
}
