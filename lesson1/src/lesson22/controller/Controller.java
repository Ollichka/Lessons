package lesson22.controller;

import lesson22.view.InputUtil;
import lesson22.view.ViewShape;
import lesson22.model.*;

public class Controller {


    private ModelShapes model;
    private ViewShape view;

    public Controller(ModelShapes model, ViewShape view) {

        this.model = model; this.view = view;
    }
    public void show() {
        model.setShapes(fill());
        int a  = InputUtil.choice(view);
        while(a!=0){
            int c = InputUtil.menu(view);
            if(c==1){
               view.printMessageAndResult(view.OUT_R,model.getShapes());
                a = InputUtil.choice(view);
            }else if(c==2){

                view.printMessageAndResultIn(view.OUT_R,model.calculateSummAll());
                a = InputUtil.choice(view);
            }
            else if(c==3){
                int s = InputUtil.inputShapeWithScanner(view);
                view.printMessageAndResultIn(view.OUT_R,model.calculateSummExact(s));
                a = InputUtil.choice(view);
            }else if(c==4){

                view.printMessageAndResult(view.OUT_R,model.sortByAreas());
                a = InputUtil.choice(view);
            }else if(c==5){

                view.printMessageAndResult(view.OUT_R,model.sortByColors());
                a = InputUtil.choice(view);
            }else a = InputUtil.choice(view);
        }
        System.exit(1);
    }

    private Shape[] fill (){
        Shape[] p = {new Rectangle(2,2,"red"),
                new Circle(5,"blue"),
                new Triangle(1,2,3,"white"),
                new Circle(2,"black"),
                new Circle(10,"crick"),
                new Triangle(3,2,6,"white"),
                new Rectangle(8,3,"blue"),
                new Rectangle(9,2,"red"),
                new Circle(9,"blue"),
                new Triangle(1,98,3,"white"),


        };
        return p;
    }
}
