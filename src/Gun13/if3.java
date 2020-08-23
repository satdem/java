package Gun13;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        //katsyıları verilen iki bilinmeyenli denklemin köklerini bulun
        Scanner oku=new Scanner(System.in);
        System.out.print("x karenin katsayısını yazınız: ");
        int a=oku.nextInt();
       double x1,x2;
        System.out.print("x in katsayısını yazınız: ");
        int b=oku.nextInt();

        System.out.print("sabit sayıyı yazınız: ");
        int c=oku.nextInt();
        double delta=b*b-4*a*c;
        double kokdelta=Math.sqrt(b*b-4*a*c);
        if(kokdelta>0) {
            x1=(-b+kokdelta)/(2*a);
            x2=(-b-kokdelta)/(2*a);
            System.out.println("iki kök var: "+x1+","+x2);
        }
        else if(kokdelta==0) {
            x1=-b/(2*a);
        System.out.println("çakışık kök: " +x1);}

        else System.out.println("kök yok");

    }
}
