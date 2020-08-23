package Mentoring.Burak36.Interface2;

public class appleDatabase implements Database{
    @Override
    public void add() {
        System.out.println("Apple çalışan ekleme");

    }

    @Override
    public void delete() {
        System.out.println("Apple dan çalışan ekleme");

    }

    @Override
    public void get() {
        System.out.println("Apple çalışan birini alma");

    }

    @Override
    public void update() {
        System.out.println("Apple calışan bilgisi güncellem ");

    }
}
