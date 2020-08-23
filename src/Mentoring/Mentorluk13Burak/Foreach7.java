package Mentoring.Mentorluk13Burak;

public class Foreach7 {
    public static void main(String[] args) {
        //TODO for loop ile for each loop un  farkı

        String[] StringArray={"Alpha","Beta","Gamma","Delta"};
        System.out.println("For loop: ");
        for(int i=0;i<StringArray.length;i++){
            System.out.println(StringArray[i]);
        }

        System.out.println("\nFor each Loop:");
        for(String Str:StringArray){
            System.out.println(Str);
        }

    }
}
