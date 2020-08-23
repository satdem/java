package Gun31.example.Ex1;

public class Ex1 {
    //ayrı bir dosyada bir student classı tanımlayınız; fields: name ,grade
    //ayrı bir dosyada Scool classı tanımlayınız ; fields:name,adress,principalName,tuitionFees
    public static void main(String[] args) {
        Student ogrenci1=new Student();

        ogrenci1.name="Ayşe";
        ogrenci1.grade=3;

        //*********1. yöntem*******
        School okulu=new School();
        okulu.adress="göztepe";
        okulu.name="Marmara üniversitesi";
        okulu.principalName="rektör";
        okulu.tuitionFees=0;

        ogrenci1.schoolInfo=okulu;

        //**********2. yöntem********
        ogrenci1.schoolInfo=new School();
        ogrenci1.schoolInfo.name="marmara üni.";
        ogrenci1.schoolInfo.adress="göztepe";
        ogrenci1.schoolInfo.principalName="Rektör";
        ogrenci1.schoolInfo.tuitionFees=0;

        System.out.println("ogrenci1.name = " + ogrenci1.name);
        System.out.println("ogrenci1.grade = " + ogrenci1.grade);
        System.out.println("ogrenci1.schoolInfo.name = " + ogrenci1.schoolInfo.name);

    }

}
