package lesson2.controller;

import lesson2.view.InputUtil;
import lesson2.view.ViewClinic;
import lesson2.model.ModelClinic;
import lesson2.model.Patiant;

public class Controller {


    private ModelClinic model;
    private ViewClinic view;

    public Controller(ModelClinic model,ViewClinic view) {

        this.model = model; this.view = view;
    }
    public void show() {
        model.setPations(fill());
        int a  = InputUtil.choice(view);
        while(a!=0){
            int c = InputUtil.menu(view);
            if(c==1){
               Object[] o =  model.sort();
               view.printMessageAndResult(view.OUT_R,o);
                a = InputUtil.choice(view);
            }else if(c==2){
                int mi = InputUtil.inputMinimumWithScanner(view);
                int ma = InputUtil.inputMaxWithScanner(view);
                Object[] o = model.showPationsWithNumber(mi,ma);
                view.printMessageAndResult(view.OUT_R,o);
                a = InputUtil.choice(view);
            }
            else if(c==3){
                String s = InputUtil.inputDiagnoseWithScanner(view);
                System.out.println(s);
                Object[] o = model.showPationsWithDiagnose(s);
                view.printMessageAndResult(view.OUT_R,o);
                a = InputUtil.choice(view);
            }else a = InputUtil.choice(view);
        }
        System.exit(1);
    }

    private Patiant[] fill (){
        Patiant[] p = {new Patiant("a","aa","aaa" ,"aaaaaa",111,"a"),
                new Patiant("b","bb","bbb" ,"bbbbbb",222,"b"),
                new Patiant("c","cc","ccc" ,"cccccc",333,"c"),
                new Patiant("as","ha","akkaa" ,"ajnjaa",231,"a"),
                new Patiant("ba","ajk","jn" ,"aaaaall,a",151,"a"),
                new Patiant("ca","ajja","aakm,a" ,"aaaapok,aa",211,"c"),
                new Patiant("ab","aajn","aakma" ,"aaaakmaa",116,"a")

        };
        return p;
    }
}
