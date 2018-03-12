package Lesson2_2;

import Lesson2_2.Controller.Controller;
import Lesson2_2.View.ViewShape;
import Lesson2_2.model.ModelShapes;

public class Start {

    public static void main(String args[]) {
       ViewShape view = new ViewShape();
        ModelShapes model = new ModelShapes();
        Controller controller = new Controller(model, view);

        controller.show();
    }
}
