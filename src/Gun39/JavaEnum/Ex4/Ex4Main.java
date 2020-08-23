package Gun39.JavaEnum.Ex4;

public class Ex4Main {
    public static void main(String[] args) {
        Months ay=Months.MART;

       /* switch (ay){
            case OCAK:
                System.out.println(31);
                break;
            case SUBAT:
                System.out.println(28);
                break;
            case MART:
                System.out.println(31);
                break;
            case NİSAN:
                System.out.println(30);
                break;
            case MAYIS:
                System.out.println(31);
                break;
            case HAZIRAN:
                System.out.println(30);
                break;
            case TEMMUZ:
                System.out.println(31);
                break;
            case AGUSTOS:
                System.out.println(31);
                break;
            case EYLUL:
                System.out.println(30);
                break;
            case EKIM:
                System.out.println(31);
                break;
            case KASIM:
                System.out.println(30);
                break;
            case ARALIK:
                System.out.println(31);
                break;

        }*/ //buna artık gerek kalmadı

        ay.getGunMiktari();//yukarıdaki işlemi yapıyor
        //atama anında constructor gibi çalışan bölüm :Months(int gunMiktari)
        //gun miktarını dayse set ediyor
        System.out.println("ay.days = " + ay.days);// yukarıdakinin yerine bu da olur
    }
}
