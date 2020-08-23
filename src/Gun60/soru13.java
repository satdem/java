package Gun60;

public class soru13 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+ " ");
            if (arr[i].equals("D")) {
                System.out.print("Work done");
                break;
            }
            continue;
        }
    }
}
//cevap ABCD Work done