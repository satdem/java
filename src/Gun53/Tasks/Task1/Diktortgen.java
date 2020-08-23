package Gun53.Tasks.Task1;

public class Diktortgen implements Sekiller{

    @Override
    public double cevresi(int... a) {
        if(a.length==1){
            return 4*a[0];
        }else
        return  2*(a[0]+a[1]);


    }

    @Override
    public double alani(int... a) {
        if(a.length==1){
            return a[0]*a[0];
        }else
            return a[0]*a[1];
    }
}
