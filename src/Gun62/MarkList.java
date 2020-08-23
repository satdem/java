package Gun62;

public class MarkList {
    int num;
    public static void graceMarks (MarkList obj4){
        obj4.num += 10;
    }
    public static void main (String[]args){

        MarkList obj1 = new MarkList();//bir nesne oluşturuldu new ile
        MarkList obj2 = obj1;//yeni nesne yok.sadece yeni referans diger referansa eşitlendi
        MarkList obj3 = null;//burada yeni nesnesi olmayan referans oluşturuldu
        obj2.num = 60;
        graceMarks(obj2);


    }
}
//soru :kaç inctance var
//cevap:1. her new bir instance demek(nesne)
