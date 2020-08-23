package Gun33.Tasks.tasks1;

public class benimMat {
    public static int getRastgele(int a,int b){
        int random=(int) ((Math.random()*(a-b)+1))+b;
        return random;
    }
    public static double getKarekok(int a){
        double d=Math.sqrt(a);
        return d;
    }
    public static double getKuvvetBulma(int a,int b){
        double d=Math.pow(a,b);
        return d;
    }
    public static int getMaxSayi(int a,int b){
        int max=Math.max(a,b);
        return max;
    }
    public static int getMinSayı(int a,int b){
        return Math.min(a,b);
    }
}
