package Gun37.classModifiers.packageTwo;

import Gun37.classModifiers.packageOne.PublicModifiersClass;

public class OtherPackageClass {
    public static void main(String[] args) {
        PublicModifiersClass sm1=new PublicModifiersClass();
        //DefaultModifiersClass sm1=new DefaultModifiersClass();
        // bunu kabul etmiyor çünkü bu class başka pakatte
    }
}
