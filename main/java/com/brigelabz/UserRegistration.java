package com.brigelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

   public boolean checkFirstName(String firstName){
       String condition= "[A-Z]{1}[a-z]{2,}";
       Pattern pattern = Pattern.compile(condition);
       Matcher checkFirstNameMach = pattern.matcher(firstName);
       if (checkFirstNameMach.matches()){
           System.out.println("Mood Happy");
       }else {
           System.out.println("Mood Sad");
       }
       return checkFirstNameMach.matches();
   }
   public boolean checkLastName(String lastName){
       String condition = "[A-Z]{1}[a-z]{2,}";
       Pattern pattern = Pattern.compile(condition);
       Matcher checkLastName = pattern.matcher(lastName);
       if (checkLastName.matches()){
           System.out.println("Mood Happy");
       }else {
           System.out.println("Mood Sad");
       }
       return checkLastName.matches();
   }
    public  boolean checkEmail(String email) {
        String Condition = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
        Pattern pattern = Pattern.compile(Condition);
        Matcher checkEmail = pattern.matcher(email);
        if (checkEmail.matches()) {
            System.out.println("Happy Mood");
        } else {
            System.out.println("Sad Mood");
        }
        return checkEmail.matches();
    }
    public  boolean phoneNumber(String phoneNumber) {
        String nameCondition = "^[0-9]{1,2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkPhoneNumber = pattern.matcher(phoneNumber);
        if (checkPhoneNumber.matches()) {
            System.out.println("Happy Mood");
        } else {
            System.out.println("Sad Mood");
        }
        return checkPhoneNumber.matches();
    }
    public  boolean passWord(String passWord) {
        String nameCondition = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*d)(?=.*[@#$%^&-+=()]).{8,}$";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkPassWord = pattern.matcher(passWord);
        if (checkPassWord.matches()) {
            System.out.println("Happy Mood");
        } else {
            System.out.println("Sad Mood");
        }
        return checkPassWord.matches();
    }
}
