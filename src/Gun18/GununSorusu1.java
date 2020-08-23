package Gun18;

public class GununSorusu1 {
    public static void main(String[] args) {
        //TODO Write program that prints this using loops
        // ***********  0bosluk11yıldız
        //  *********   1bosluk9yıldız
        //   *******    2bosluk7yıldız
        //    *****     3bosluk5yıldız
        //     ***      4bosluk3yıldız
        //      *       5bosluk1yıldız
        // 6 satır
        // 1 satır döngüsü, sütunlar:1 tane boşluk döngüsü,1 tane yıldız döngüsü
        for(int row=1;row<=6;row++){//satır tamam

            for(int bosluk=0;bosluk<row-1;bosluk++) System.out.print(" ");//bosluk tamam artarak gidiyor

            for(int sutun=13-row*2;sutun>0;sutun--){ System.out.print("*");}//sutun azalarak gidiyor

            System.out.println();

        }


    }
}

