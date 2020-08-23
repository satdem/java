package Gun60;

public class soru9 {
    public static void main(String[] args) {
        int [] intArr = {8, 16, 32, 64, 128};

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i] + " ");
        }

        for (int i : intArr){
            System.out.println(i + " ");
        }
    }
}
