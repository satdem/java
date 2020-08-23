package Gun58.Ornek1;

import java.util.ArrayList;

public class TechnoKitchen {
    double ucret=0;
   public static void Pisir(AdanaKebap adanaKebap){
        adanaKebap.marinade();
        adanaKebap.grill();

    }
    public static void Pisir(Lahmacun lahmacun){
        lahmacun.dough();
        lahmacun.topping();
        lahmacun.addMeat();
        lahmacun.bake();

    }
   public static void Pisir(Borsh borsh){
        borsh.boil();
        borsh.eatTomorrow();

    }
    public static void Pisir(Palov palov){
        palov.fry();
        palov.boil();
    }
    /* //hocanın yolu
    *  public static void Pisir(IFood yemek){
        System.out.println("===="+yemek.getClass().getSimpleName()+"==== hazırlanıyor..");

          if (yemek instanceof AdanaKebap)
          {
              AdanaKebap kebap=(AdanaKebap)yemek;
              kebap.marinade();
              kebap.grill();
          }
          else
          if (yemek instanceof Lahmacun)
          {
              Lahmacun l=(Lahmacun)yemek;
              l.dough();
              l.topping();
              l.addMeat();
              l.bake();
          }
          else
          if (yemek instanceof Borsh)
          {
              Borsh b=(Borsh)yemek;
              b.boil();
              b.eatTomarrow();
          }
          else
          if (yemek instanceof Palov)
          {
              Palov p=(Palov)yemek;
              p.fry();
              p.boil();
          }

        yemek.taste();
    }
*/

}
