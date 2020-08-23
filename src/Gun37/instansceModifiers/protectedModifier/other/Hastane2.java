package Gun37.instansceModifiers.protectedModifier.other;

import Gun37.instansceModifiers.protectedModifier.same.Doktor;

public class Hastane2 {
    public static void main(String[] args) {
        //protected olduğunda default gibi diğer paketlerde kullanamıyorum
        //Doktor dr3=new Doktor();

        Doktor dr4=new Doktor("ömer");// bunu kullandım bu public

        //dr4.print();
        //bunu da kullnamıyorum bu(print metodu) çünkü protected


    }
}
