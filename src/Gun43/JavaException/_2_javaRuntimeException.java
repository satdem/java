package Gun43.JavaException;

public class _2_javaRuntimeException {
    public static void main(String[] args) {
        System.out.println("program çalıştı");
        String str="";
        //str.charAt();//bu çalışmaz build diyor
        str.charAt(3);//bu çalışıyor çalıştıktan sonra hata veriyor.StringIndexOutOfBoundsException: hatası veriyor
        //yani verilen stringin lengthi yetersiz

    }
}
//çalışma zamanı hatası şeklinde hata grubu var: RunTime Error Excepton
// bir de derlenme zamanı hatası grubu var; Compile Error Exception(kızarmalar)