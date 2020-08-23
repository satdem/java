package Gun36.Tasks.Task1;

public class Book {
    String name;
    int publishYear;
    String autor;
    public Book(String name,int publishYear,String autor){
        this.name=name;
        this.publishYear=publishYear;
        this.autor=autor;
    }
    public Book(String name,int publishYear){
        this(name,publishYear,"");
    }
    public Book(String name){
        this(name,0,"");
    }

    //2. yazdırma metodu:toString
    public String toString(){
        return name+" "+publishYear+" "+autor;
    }
    public void showInfo(){
        System.out.println("name: "+name+"\nyayın yılı: "+publishYear+"\nYazar:"+autor);
    }
}
