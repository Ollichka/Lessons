package lesson5.Lesson51.controller;

import lesson5.Lesson51.model.ModelNotes;
import lesson5.Lesson51.model.Note;
import lesson5.Lesson51.view.InputUtil;
import lesson5.Lesson51.view.ViewNote;

import java.util.ArrayList;

public class Controller {


    private ModelNotes model;
    private ViewNote view;

    public Controller(ModelNotes model, ViewNote view) {

        this.model = model;
        this.view = view;
    }
    public void show() {
        int a  = InputUtil.choice(view);
        while(a!=0){
            int c = InputUtil.menu(view);
            if(c==2){
               ArrayList<Note> n = model.getNotes();
               view.printMessageAndResult(view.OUT_R,n);
                a = InputUtil.choice(view);
            }else if(c==1){

                String name = null;
                String surname  = null;
                String birthday = null;
                while(!CheckResult.checkName(name)){
                    if(name!= null) view.printMessage(view.WRONG_IN);
                    name =InputUtil.inputNameWithScanner(view);
                }

                while(!CheckResult.checkSurname(surname)){
                    if(surname!= null) view.printMessage(view.WRONG_IS);
                    surname =InputUtil.inputSurnameWithScanner(view);
                }

                while(!CheckResult.checkBirthday(birthday)){
                    if(birthday!= null) view.printMessage(view.WRONG_IB);
                    birthday =InputUtil.inputBirthdayWithScanner(view);
                }

            }else a = InputUtil.choice(view);
        }
        System.exit(1);
    }

}
