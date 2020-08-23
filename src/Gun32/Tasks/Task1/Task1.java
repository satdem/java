package Gun32.Tasks.Task1;

public class Task1 {
    //1.ADIM: ayrı bir dosyada Rectangle isminde bir sınıf yazınız. fields:width,length
    //2.ADIM: busınıf için kullanılmak üzere getPerimeter isminde bir metod yazın
    //3.ADIM: getArea adında bir metod oluşturun alan hesaplasın
    //4.ADIM:
    public static void main(String[] args) {
        Rectangle dikdortgen=new Rectangle();
        dikdortgen.length=4;
        dikdortgen.width=5;

        System.out.println("dikdortgen.getPerimeter() = " + dikdortgen.getPerimeter());
        System.out.println("dikdortgen.getArea() = " + dikdortgen.getArea());

    }
}
