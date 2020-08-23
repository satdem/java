package Mentoring.Burak36.Interface2;

public class microsoftDatabase implements Database {

    @Override
    public void add() {
        System.out.println("Microsofta Çalışan ekleme");
    }

    @Override
    public void delete() {
        System.out.println("Microsoftan Çalışan çıkarma");

    }

    @Override
    public void get() {
        System.out.println("Microsofta Çalışan bilgisi alma");

    }

    @Override
    public void update() {
        System.out.println("Microsofta Çalışan bilgisi güncelleme");

    }
}
