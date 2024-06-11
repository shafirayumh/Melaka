package utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

public class GenerateInput {

    public static String generateByDate(){
        String date = new SimpleDateFormat("yyMMddmmss").format(new Date());
        return date;
    }

    public static String generateName(){
        String name = "tester" + generateByDate();
        return name;
    }

    public static String generatePhoneNumber(){
        String phoneNumber = "81" + generateByDate();
        return phoneNumber;
    }

    public static String generateBusinessName(){
        String business = "tester-bisnis" + generateByDate();
        return business;
    }

    public static String generateEmail(){
        String email = "tester" + generateByDate() + "@mail.com";
        return email;
    }

    public static String password(){
        String pass = "password123";
        return pass;
    }
}
