package lesson3.lesson31;

public class Runner {

    public static void runner(){
        System.out.println("Create new shop");
        Shop sh = new Shop();
        System.out.println("Add new sections");
        sh.addSectionwithAmount("section1", Shop.Goods.SWEETS,1,100);
        sh.addSection("section2", Shop.Goods.CHEESE,2);
        sh.addSection("section3", Shop.Goods.FISH,4);
        sh.addSectionwithAmount("section4", Shop.Goods.MEAT,3,108);
        sh.addSectionwithAmount("section5", Shop.Goods.WATER,1,700);
        sh.showInfo(sh.getSections());
        sh.deleteSectionByType(Shop.Goods.WATER);
        System.out.println("show section with type fish");
        System.out.println(sh.showByType(Shop.Goods.FISH));
        System.out.println("show sorted");
        sh.showInfo(sh.sortByFloors());
    }
}
