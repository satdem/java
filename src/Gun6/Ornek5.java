package Gun6;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //kullanıcıdan kaç bilet istediğini ve sigorta isteyip istemediğini boolean kullnarak yazdırınız.
        System.out.print("Kaç bilet istiyorsunuz: ");
        byte a=oku.nextByte();
        System.out.print("Sigorta istiyorsunuz doğru mu: ");
        boolean b=oku.nextBoolean();
        System.out.println(a+" bilet ve sigortam var "+b );


    }
}
