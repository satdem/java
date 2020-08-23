package Gun59.Ornek1;

public abstract class Bank {
    private String name;
    private String phoneNummer;
    private String adress;
    private int numEmployee;
   private double balance;

    public Bank() {
    }

    public Bank(String name, String phoneNummer, String addres, int numEmployee) {
        setName(name);
        setPhoneNummer( phoneNummer);
        setAdress( addres);
        setNumEmployee(numEmployee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNummer() {
        return phoneNummer;
    }

    public void setPhoneNummer(String phoneNummer) {
        this.phoneNummer = phoneNummer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(int numEmployee) {
        this.numEmployee = numEmployee;
    }

    public double getBalance() {
        return balance;
    }


    abstract void oppenAccount();
    abstract void closeAccount();
    //çekilen para
    String withdraw(double gidenPara){
         this.balance-=gidenPara;
        return "Hesabınızdan "+gidenPara+"€ çekildi.Bakiyeniz= "+balance;
    }
    //yatırılan Para demek
    String deposit(double gelenPara){

        balance+=gelenPara;
        return "Hesabınıza "+gelenPara+"€ geldi.Bakiyeniz= "+balance;
    }
    //faiz demek
    String loan(){

        return "Kredi çekebilirsiniz...";
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", phoneNummer='" + phoneNummer + '\'' +
                ", addres='" + adress + '\'' +
                ", numEmployee=" + numEmployee +
                ",balance= "+balance+
                '}';
    }
}
