package Mentoring.mentorluk12zeynep;

public class LebelledLoop5 {
    public static void main(String[] args) {
        OUTER_LOOP:
        for(int i=0;i<10;i++){
            INNER_LOOP:
            for(int j=0;j<10;j++){
                if(j==4) break OUTER_LOOP;//döngüyü dıştada kırıyor. break sadece iç döngüyü kırıyordu
                System.out.println(i+"*"+j+"="+i*j);
            }
        }

    }
}
