import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jj {
    public static void main(String[] args) {
        String str = ",Lena, Ludmila, SvetluLcua,, Lulu, Natalia, ,Liliana, Lu";
        Pattern p = Pattern.compile("Lu^\\b*?\\b");
        Matcher m = p.matcher(str);
        System.out.println("Исходная строка -> " + str);
        str = m.replaceAll("Masha");
        System.out.println("Измененная строка -> " + str);
    }
}
