package Mentoring.mentorluk12zeynep;

public class NestedLoopOrnek4 {
    public static void main(String[] args) {
        char c= 'A';
        int alfabet=c;

        for (int i = 0; i <=6 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(alfabet) + " ");
            }
            alfabet++;
            System.out.println();
        }
    }
}
