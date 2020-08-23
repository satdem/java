package Gun39.JavaEnum.Ex1;

public class Ex1 {
    public static void main(String[] args) {

    // todo verilen gün bilgisine göre haftanın kaçıncı günü olduğunu yazınız
    /*int gunNo=5;
    switch (gunNo){
        case 1:
            System.out.println("Haftanın 1. günü");
        case 2:
            System.out.println("Haftanın 2. günü");
        case 3:
            System.out.println("Haftanın 3. günü");
        case 4:
            System.out.println("Haftanın 4. günü");
        case 5:
            System.out.println("Haftanın 5. günü");
        case 6:
            System.out.println("Haftanın 6. günü");
        case 7:
            System.out.println("Haftanın 7. günü");
    }*/
        // todo verilen ay nosuna göre ayın kaç gün olduğunu yazdırınız

        int ayNo=3;
        Aylar ay=Aylar.MART;
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());

        switch (ay){
            case OCAK:
                System.out.println(31);break;
            case SUBAT:
                System.out.println(28);break;
            case MART:
                System.out.println(31);break;
            case NİSAN:
                System.out.println(30);break;
            case MAYIS:
                System.out.println(31);break;
            case HAZIRAN:
                System.out.println(30);break;
            case TEMMUZ:
                System.out.println(31);break;
            case AGUSTOS:
                System.out.println(31);break;
            case EYLUL:
                System.out.println(30);break;
            case EKIM:
                System.out.println(31);break;
            case KASIM:
                System.out.println(30);break;
            case ARALIK:
                System.out.println(31);break;

        }


    }

}
