package Gun55.Ornekler.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil( ) {
        System.out.println("Kullanılıyor...");
        //bunun kullanıldığını göstermek için yazdık
    }

    public Sekil(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double AlanHesabi();
    abstract double CevreHesabi();

    @Override
    public String toString() {
        return "Sekil{" +"isim="+this.name+
                "\n Alan=" + Math.round(this.AlanHesabi() ) +
                "\n Cevre="+Math.round(this.CevreHesabi())+
                '}';
    }
    public String toString2() {
        String formatliCevre=String.format("%-10.2f",this.CevreHesabi());//- ise sola dayalı yazıyordu
        String formatliAlan=String.format("%-10.2f",this.AlanHesabi());
        // toplam 10 hane noktadan sonra ise 2 hane
        // - ise sola dayalı yazar

        return "Sekil{" +"isim="+this.name+
                "\n Alan=" + formatliAlan +
                "\n Cevre="+formatliCevre+
                '}';
    }

    void Ciz(){
        System.out.println(getName()+"Çizildi...");
    }
}
