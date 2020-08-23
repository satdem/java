package Gun13;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        //soru: kullanıcıdan fizik:90 şeklinde not bilgisini alınız
        //>90 için A
        //>80 için B
        //>70 için C
        //>60 için D
        //>40 için E
        //<40 için F yazdırın
        Scanner oku=new Scanner(System.in);
        System.out.print("dersin adını ve notunuzu yazınız: ");
        String dersnot=oku.nextLine();

        int a=dersnot.indexOf(" ");
        int notd=Integer.parseInt(dersnot.substring(a+1));

        if(notd>=90)
            System.out.println("notunuz: A");
         else if(notd>=80)
             System.out.println("notunuz: B");
          else if(notd>=70)
            System.out.println("notunuz: C");
           else  if(notd>=60)
            System.out.println("notunuz: D");
            else   if(notd>=40)
              System.out.println("notunuz:E ");
             else if(notd<40)
               System.out.println("notunuz: F");


      /*  String str = oku.nextLine();   //replaceAll kullanarak bu şekildede çözülebilir//

        int not = Integer.parseInt(str.replaceAll("[^0-9]",""));//sadece not şeklinde değişken olşturma
                                                                //yanliş bir manaya gelebiliyormuş
        System.out.println(not);

        if (not >= 90) {
            System.out.println("A");
        }
        else if (not >= 80){
            System.out.println("B");
        }
        else if (not >= 70) {
            System.out.println("C");
        }
        else if (not >= 60) {
            System.out.println("D");
        }
        else if (not >= 40) {
            System.out.println("E");
        }
        else {
            System.out.println("F");
        }*/

    }
}









