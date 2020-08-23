package Gun47.Task2;

public class Account {
     int number;//hesapno
    private double balance;//bakiye

    public Account(int number) {
        this.number = number;

    }
    public void deposit(double yatirilanPar){

        this.balance+=yatirilanPar;//incomemoney(ingilizceleri)
    }
    public void withdraw(double cekilenPara){

        if(cekilenPara>5000){
            throw new RuntimeException("Günlük limiti aştınız");
        }
      if(cekilenPara>this.balance){
       throw new RuntimeException("Yetersiz bakiye");
      }
        this.balance-=cekilenPara;//outcomemoney(ingilizceleri)
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
