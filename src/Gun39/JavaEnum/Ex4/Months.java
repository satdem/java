package Gun39.JavaEnum.Ex4;

public enum Months {
    OCAK(31),//KÜÇÜK HARFLEDE YAZABİLİRİZ
    SUBAT(28),
    MART(31),
    NİSAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31);

    int days;

    //bu bölüm atama yapılınca çalışıyor.
    //String de olabilir
    Months(int gunMiktari){
        days=gunMiktari;
    }

    void getGunMiktari(){
        System.out.println("days = " + days);
    }

}
