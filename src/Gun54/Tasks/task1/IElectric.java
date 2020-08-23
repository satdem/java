package Gun54.Tasks.task1;
//bir interface i başka bir interface den miras aldık
public interface IElectric extends IVehicle {

    final static int batteryLife=100;

   String changeBattery();

   //interface lerde sadece aşağıdaki 2 şekilde gövdeli metod kullanılabilir

    //default belirteci ile
    default void print(){
       System.out.println("default tipli metod yazılabilir");
   }
   //veya static seklinde
   static void autoPilot(){
       System.out.println("otonom sürüş modu");
   }

}
