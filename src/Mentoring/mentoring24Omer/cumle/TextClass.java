package Mentoring.mentoring24Omer.cumle;

public class TextClass {
    public String ilkYarisi(String a){
        String ilkYari="";
        int size=a.length();
        ilkYari=a.substring(0,size/2);
        return ilkYari;
        
    }
    public String ikinciYarisi(String a){
        String ikinciYari="";
        int size=a.length();
        ikinciYari=a.substring(size/2);
        return ikinciYari;

    }
}
