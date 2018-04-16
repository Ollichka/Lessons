import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {

   private  ArrayList<Item> items = new ArrayList<Item>();

    public Sentence(String sent) {
        String r0 = "\\s|[,.!\\?]";
        Pattern p0 = Pattern.compile(r0);
        Matcher m0 = p0.matcher(sent);
        int begin = 0;
        while(m0.find()){
            String text = m0.group();
            if(m0.start()!=begin) {
                items.add(new Word(sent.substring(begin, m0.start())));
            }
            if(text.equals("!")||text.equals("?")||text.equals(".")||text.equals(",")){
                items.add(new Delimeter(text));
            }

            begin = m0.end();
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }


    @Override
    public String toString() {
        String st = "";
        for(Item i :items)
            st+=i;
        return st;
    }
}
