package Gun17;

public class JavaNestedLoop8 {
    public static void main(String[] args) {
        //    *
        //   **
        //  ***
        // ****
        //*****
        for(int i=1;i<=5;i++){
            for(int bosluk=5-i;bosluk>0;bosluk--){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}


