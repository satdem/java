package Mentoring.Mentoring19Sema;

public class TestSonuc2 {
    public static void main(String[] args) {
        /*
 ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz.

  //ogrencilerin cevaplari
  char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
*
* // cevap anahtari
  char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

  output:
  0 nolu ogrencinin 7 dogru cevabi var.
  1 nolu ogrencinin 6 dogru cevabi var.
           "           "
           "           "
           "           "
  7 nolu ogrencinin 7 dogru cevabi var.

*
*  */
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        testSonuc(answers,keys);


    }
    public static void testSonuc(char[][] cevaplar,char[] cevapanahtari){

          for (int i = 0; i <cevaplar.length ; i++) {
             int ds=0;
            for (int j = 0; j <cevaplar[i].length ; j++) {
                if (cevapanahtari[j]==cevaplar[i][j])
                    ds++;
            }
              System.out.println(i +".öğrencinin "+ds+" doğru cevabı var");
          }

    }
}
