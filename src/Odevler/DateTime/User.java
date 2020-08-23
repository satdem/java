package Odevler.DateTime;

import java.time.LocalDateTime;

public class User {
    String Name;
    LocalDateTime registerDate;

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}
