package Mentoring.Tahir25.ornek1;

public class Main {
    public static void main(String[] args) {

    }
    public char lastCharacter(String str){
        return str.charAt(str.length()-1);
    }
    public int FaktoriyelBulma(int num){
        int faktoriyel=1;

        while(num>0){
            faktoriyel=faktoriyel*num;
            num--;
        }
        return faktoriyel;
    }
}
