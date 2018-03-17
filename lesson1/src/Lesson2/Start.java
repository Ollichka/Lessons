package lesson2;

import lesson2.controller.Controller;
import lesson2.view.ViewClinic;
import lesson2.model.ModelClinic;

public class Start {

    public static void main(String args[]) {
       ViewClinic view = new ViewClinic();
        ModelClinic model = new ModelClinic();
        Controller controller = new Controller(model, view);

        controller.show();
    }
}
