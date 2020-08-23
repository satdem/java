package Gun46.Tasks.task1;

import java.util.Scanner;

import static Gun46.Tasks.task1.User.*;

public class UserName {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        boolean usernameIste=true;
        String userName="";
        String password="";

        int miktar=0;
        do{
            if(usernameIste) {
                System.out.print(miktar + 1 + ".UserName = ");
                userName = oku.nextLine();
            }
            System.out.print("Password= ");
             password = oku.nextLine();

            try {
                User yeniUser = new User(userName, password);

                miktar++;
                usernameIste=true;
                yeniUser.kullanici(yeniUser);

            }catch (Exception ex){
                usernameIste=false;
                System.out.println(ex.getMessage());
            }

        }while (miktar<2);


    }
}
