package Lesson2;

import Lesson2.Controller.Controller;
import Lesson2.View.ViewClinic;
import Lesson2.model.ModelClinic;
import Lesson2.model.Patiant;

public class Start {

    public static void main(String args[]) {
       ViewClinic view = new ViewClinic();
        ModelClinic model = new ModelClinic();
        Controller controller = new Controller(model, view);

        controller.show();
    }
}
