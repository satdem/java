package Mentoring.Omer28.KahveDukkani;

public enum renkler {
    KIRMIZI("DUR"),SARI("HAZIR OL"),YESİL("GEC");
String s;
    renkler(String s) {
        this.s=s;
    }
    String getKural(){
        return s;
    }

    public static void main(String[] args) {
        renkler[] tumRenkler=renkler.values();
        for (renkler renkleriYazdir:tumRenkler) {
            System.out.println("Renk "+renkleriYazdir.name()+" Kural: "+renkleriYazdir.getKural());

        }
    }


}
