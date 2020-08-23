package Mentoring.Mentorluk8zeynep;

public class randomOrnek1 {
    public static void main(String[] args) {
        Math.random();//0.0 ve 1.0 arasında rastgele değer veriyor
        double random=Math.random();
        //eğer tam sayı olarak bir değer istiyorsak *0 gibi bir sayı ile çarpabiliriz.
        // eğer bir değer aralığında olacak şekilde bir random rakam istiyorsak aşağıdaki formülü kullanıyoruz
       // (int)Math.random()*((max-min) +1)+min
        int min =0;
        int max=15;
        int randomNummer=(int)(Math.random()*((max-min)+1))+min;
        System.out.println("randomNummer = " + randomNummer);
    }
}
