package lesson5;

import lesson5.Lesson51.controller.Controller;
import lesson5.Lesson51.model.ModelNotes;
import lesson5.Lesson51.view.ViewNote;

public class Start {

    public static void main(String args[]) {
       ViewNote view = new ViewNote();
        ModelNotes model = new ModelNotes();
        Controller controller = new Controller(model, view);

        controller.show();
    }
}
