package Mentoring.mentorluk12zeynep;

public class NestedLoopornek3 {
    public static void main(String[] args) {
        char c=0;
        for(int i=65;i<=70;i++){
            for (int j=65;j<=i;j++){
                c=(char)j;
                System.out.print(c+" ");
            }
            System.out.println();
        }
        /*2. yol
        char c= 'A';
         int alfabet=c;

        for (int i = 0; i <=6 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(alfabet + j) + " ");
            }
            System.out.println();
        }
         */
    }
}
