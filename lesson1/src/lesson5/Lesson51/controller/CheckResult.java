package lesson5.Lesson51.controller;

import java.util.regex.*;

public class CheckResult {

    public static boolean checkName(String name){
        if (name==null||name.equals("")) return false;
        Pattern pn = Pattern.compile("[^A-Za-z]");
        Matcher m = pn.matcher(name);
        if(m.find()) return false;
        else return true;
    }

    public static boolean checkSurname(String surname){
        if (surname==null||surname.equals("")) return false;
        Pattern pn = Pattern.compile("[^A-Za-z\\-]");
        Matcher m = pn.matcher(surname);
        if(m.find()) return false;
        else return true;
    }

    public static boolean checkBirthday(String birthday){
        if (birthday==null) return false;
        Pattern pn = Pattern.compile("(0|1|2|3)?[0-9]{1,1}\\s+(0|1|)?[0-9]{1,1}\\s+(1|2){1,1}(0|9){1,1}\\d{2,2}");
        Matcher m = pn.matcher(birthday);
        if(m.find()) return true;
        else return false;
    }
}
