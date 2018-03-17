package lesson3.lesson31;

import java.util.ArrayList;
import java.util.Comparator;

public class Shop {



    public  enum Goods {MEAT,WATER,SWEETS,FISH,CLOTHES,CHEESE};

    private ArrayList<Section> sections = new ArrayList<Section>();

    public void addSection(String name, Goods type, int num){
        this.addSectionwithAmount(name,type,num,0);
    }

    public void addSectionwithAmount(String name, Goods type, int num,int amount){
        sections.add(new Section( name, type, num,amount));
    }

    public void deleteSectionByType(Goods type){
        int s = findSectionIndexByType(type);
        if(s>-1) sections.remove(s);

    }

    private int findSectionIndexByType(Goods type){
        for (Section s:sections ) {
            if (s.getType()==type)  return sections.indexOf(s);
        }
        return -1;
    }

    public Section showByType(Goods type){
        int s = findSectionIndexByType(type);
        if(s>-1) return sections.get(s);
        return null;
    }

    public void suplly(Goods type,int amount){
        int s = findSectionIndexByType(type);
        if(s>-1) sections.get(s).changeAmount(amount);
    }

    public void sold(Goods type,int amount){
        int s = findSectionIndexByType(type);
        if(s>-1) sections.get(s).changeAmount(amount);
    }

    public Section[] sortByFloors(){

         sections.sort(new Comparator<Section>() {
            @Override
            public int compare(Section o1, Section o2) {
                return o1.getSectionNumber()>o2.getSectionNumber()?1:o1.getSectionNumber()==o2.getSectionNumber()?0:-1;
            }
        });
         Section[] s = new Section[sections.size()];
         return sections.toArray(s);
    }

    public void showInfo(Section[] sc){

        if(sc!=null){for (Section s:sc  ) {
            System.out.println(s);
        }
        }
    }





    public Section[] getSections() {
        Section[] s = new Section[sections.size()];
        return sections.toArray(s);
    }


    class Section{

        private String name;
        private Goods type;
        private int sectionNumber;
        private int amount;

        public Section(String name, Goods type, int num){
            this(name,type,num,0);
        }

        public Section(String name, Goods type, int num,int amount){
            this.name = name;
            this.type = type;
            this.sectionNumber = num;
            this.amount = amount;
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Goods getType() {
            return type;
        }

        public void setType(Goods type) {
            this.type = type;
        }

        public int getSectionNumber() {
            return sectionNumber;
        }

        public void setSectionNumber(int sectionNumber) {
            this.sectionNumber = sectionNumber;
        }

        public void changeAmount(int amount) {
            this.amount+= this.amount-amount> 0 ? amount:0;
        }


        public int getAmount() {
            return amount;
        }

        public String toString(){
            return this.name+ " ,type : "+this.type+ ", located at floor : "+this.sectionNumber+", amount left: "+this.amount;
        }
    }
}
