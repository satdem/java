package Gun38.nonAccessModifier.finalModifier.example2;

public class Person {
    String name;
    final int fingerprintCode;//parmakizi

    public Person(String name, int fingerprintCode) {
        this.name = name;
        this.fingerprintCode = fingerprintCode;
    }
    //final değişkenlerine ilk değer atama işlemi direk yapılabildiği gibi
    //constructor ile de atanabilir(sadece constructor ile)
    //ancak daha sonra değeri yine değiştirilemez.!!!!


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fingerprintCode=" + fingerprintCode +
                '}';
    }
}
