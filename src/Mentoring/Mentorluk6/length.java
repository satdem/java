package Mentoring.Mentorluk6;

public class length {
    public static void main(String[] args) {
        String str="We are learning java";
        System.out.println(str.length());
        if(str.length()>10) {
            System.out.println("too long string");
        }
        if(str.length()==10) {
            System.out.println("length of string is 10");
        }
        if(str.length()<10){
            System.out.println("too short string");
        }
    }
}
