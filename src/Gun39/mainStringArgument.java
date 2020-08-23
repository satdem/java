package Gun39;

public class mainStringArgument {
    public static void main(String[] args) {
        //run ->edit configurations->program argument: eleman eklemek için

        //copy dosya1 dosya2 ye kopyala
        System.out.println("args[0] = " + args[0]);
        System.out.println("args[1] = " + args[1]);
        for (String s:args) {
            System.out.println("s = " + s);
        }
    }
}
