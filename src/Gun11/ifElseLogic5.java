package Gun11;

import java.util.Scanner;

public class ifElseLogic5 {
    public static void main(String[] args) {
        //Girilen bir stringin uzunluğu 10 dan büyük ve içinde "study" kelimesi geçiyorsa ekrana evet yazdırın
        //değilse hayır yazdırın
        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle yazınız: ");
        String text=oku.nextLine();
        if(text.length()>10 && text.contains("study"))
            System.out.println("evet");
        else System.out.println("hayır");

    }
}
