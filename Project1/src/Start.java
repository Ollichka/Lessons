import controller.Controller;
import model.ModelBank;
import view.ViewBank;

public class Start {

    public static void main(String args[]) {
       ViewBank view = new ViewBank();
        ModelBank model = new ModelBank();
        Controller controller = new Controller(model, view);

        controller.show();
    }
}
