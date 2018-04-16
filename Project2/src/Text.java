import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    private BufferedReader br;
    ArrayList<Sentence> sents = new ArrayList<>();

    public Text(String fileName) {
        String thisLine = "";

        try {
            // open input stream test.txt for reading purpose.
            br= new BufferedReader(new FileReader(new File(fileName)));
            String temp = br.readLine();
            while (temp != null) {
                thisLine+=temp;
                temp = br.readLine();
            }
            String reg = "[.!//?]";
            Pattern p0 = Pattern.compile(reg);
            Matcher m0 = p0.matcher(thisLine);
            int begin = 0;
            while(m0.find()) {
                sents.add(new Sentence(thisLine.substring(begin, m0.end())));
                begin = m0.end();
            }

        } catch(Exception e) {
            System.out.println("No such file found");
        }




    }

    public void replaceFirstChar(){
        for(Sentence s:sents){
            for(Item i : s.getItems()){
                if(i instanceof Word){
                    String first = i.getName().charAt(0)+"";
                    Pattern p0 = Pattern.compile(first,Pattern.CASE_INSENSITIVE);
                    Matcher m0 = p0.matcher(i.getName());
                    i.setName(first+m0.replaceAll(""));
                }
            }
        }
    }

    @Override
    public String toString() {
        String st = "";
        for(Sentence i : sents)
            st+=i;
        return st;
    }
}
