package Gun32.Tasks.Task2;

public class ElectricityAccount {
    int totalKw;
    double rate=0.7;
    double bill;
    void tuketimEkle(int tuketim){

        totalKw+=tuketim;

    }
    double totalBill(){
        bill=totalKw*rate;
        return bill;
    }
}
