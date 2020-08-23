package Gun36.example.Example1;
//burası tür yapısı yani class

public class Student {
    int id;//kimlik numarası
    String name;
    String surName;
    int classroom;

    //Constructor: yapıcı metod : ilk oluşmada yapılması istenen
    //işlemlerin yazıldığı metod
    public Student(int id,String name,String surName,int classroom){
        //this burada classın kendisini yani studenti gösteriyor
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.classroom=classroom;
        //System.out.println("constructor çalıştı");
    }
    public Student(int id,String name,String surName){
        /*this.id=id;
        this.name=name;
        this.surName=surName;
        this.classroom=0;*/
        this(id,name,surName,0);
    }
    public Student(int id,String name){
       /* this.id=id;
        this.name=name;
        this.surName="";
        this.classroom=0;*/
        this(id,name,"",0);
    }
    public Student(int id){
        /*this.id=id;
        this.name="";
        this.surName="";
        this.classroom=0;*/
        this(id,"","",0);
    }
    public Student(){
        /*this.id=0;
        this.name="";
        this.surName="";
        this.classroom=0;*/
        this(0,"","",0);
    }


    /*public static Student createStudent(int id,String name,String surName,int classroom){
        Student ogrenci=new Student();
        ogrenci.id=id;
        ogrenci.name=name;
        ogrenci.surName=surName;
        ogrenci.classroom=classroom;
     return ogrenci;
    }*/
}
