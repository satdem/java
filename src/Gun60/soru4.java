package Gun60;

public class soru4 {
    public static void main(String[] args) {
        String[] strs=new String[2];
        int idx=0;
        for (String s: strs) {
            //strs[idx]=strs[idx] + (" element " + idx); // bu şekilde olsaydı hata vermezdi..
            strs[idx].concat(" element " + idx);//içi boş olduğu için atama yapamıyor onun için
            // NullPointerException extends RuntimeException
            //hatası veriyor.concat var olaana ekleme yapıyor boş olana yapmaz
            idx++;
        }
        for (idx=0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }
    }
}
