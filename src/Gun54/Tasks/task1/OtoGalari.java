package Gun54.Tasks.task1;

import java.util.ArrayList;

public class OtoGalari {
    public static void main(String[] args) {
        TeslaCar tesla=new TeslaCar("Tesla p90",310);
        ToyotaPirus toyoto=new ToyotaPirus("pirus",1200);
        Bus otobus=new Bus("302",6000);

        tesla.print();
        IElectric.autoPilot();

        ArrayList<Vehicle> tasitlar=new ArrayList<>();
        ArrayList<IVehicle> tasitlar1=new ArrayList<>();

        tasitlar.add(tesla);
        tasitlar.add(toyoto);
        tasitlar.add(otobus);

        tasitlar1.add(tesla);
        tasitlar1.add(toyoto);
        tasitlar1.add(otobus);

        for (Vehicle arac:tasitlar) {
            System.out.println(arac);
        }

        for (Vehicle v:tasitlar) {
            System.out.println(v.getClass().getSimpleName());
        }
        for (IVehicle v:tasitlar1) {//bu kısmı ben ekledim super classını yazdırdım
            System.out.println(v.getClass().getSuperclass());
        }
    }
}
