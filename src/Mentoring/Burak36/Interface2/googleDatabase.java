package Mentoring.Burak36.Interface2;

public class googleDatabase implements Database {
    @Override
    public void add() {
        System.out.println("Google çalışan ekleme");
    }

    @Override
    public void delete() {
        System.out.println("Google dan çalışan ekleme");
    }

    @Override
    public void get() {
        System.out.println("Google çalışan birini alma");
    }

    @Override
    public void update() {
        System.out.println("Google calışan bilgisi güncellem ");
    }
}
