package Mentoring.mentoring23burak;

public class car {
    //todo    static olmayan metod

    public void tamGaz(){
        System.out.println("bu araba bütün arabalardan daha hızlı");

    }
    public void maxSpeed(int speed){
        System.out.println("bu arbanın max hızı :"+speed);

    }
    public static void main(String[] args){
        car mycar=new car();
        mycar.tamGaz();
        System.out.println("-------------------------");
        mycar.maxSpeed(500);
    }
}
