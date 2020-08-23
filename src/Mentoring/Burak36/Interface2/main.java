package Mentoring.Burak36.Interface2;;

class dataBasemanager{
    public void addDatabase(Database database){
        database.add();
    }
    public void deleteDatabase(Database database){
        database.delete();
    }
    public void getDatabase(Database database){
        database.get();
    }
    public void updateDatabase(Database database){
        database.update();
    }

}

public class main {
    public static void main(String[] args) {
        dataBasemanager manager=new dataBasemanager();

        manager.addDatabase(new microsoftDatabase());
        manager.deleteDatabase(new microsoftDatabase());
        manager.getDatabase(new microsoftDatabase());
        manager.updateDatabase(new microsoftDatabase());
        manager.addDatabase(new microsoftDatabase());

        System.out.println("----------------------------------");
        manager.addDatabase(new googleDatabase());
        manager.deleteDatabase(new googleDatabase());
        manager.getDatabase(new googleDatabase());
        manager.updateDatabase(new googleDatabase());
        manager.addDatabase(new googleDatabase());

        System.out.println("-----------------------------");
        manager.addDatabase(new appleDatabase());
        manager.deleteDatabase(new appleDatabase());
        manager.getDatabase(new appleDatabase());
        manager.updateDatabase(new appleDatabase());



    }
}
