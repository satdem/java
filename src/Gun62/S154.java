package Gun62;

public class S154 {
    int count;

    public static void displayMsg () {
        //System.out.println("Welcome Visit Count: "+ count++); // line n1

        // static olmayan dışardaki değişkenler static metodun içinden çağrılamaz.
        //count static olmadığı için bu metoda çağıramıyoruz
    }

    public static void main(String[] args) {
        S154.displayMsg();
        displayMsg();  // line n2
    }

    public void metod2()
    {
//mesela bunu main de direkt kullanamam çünkü static değil
    }
}
