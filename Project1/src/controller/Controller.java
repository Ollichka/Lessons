package controller;


import model.Bank;
import model.ModelBank;
import view.InputUtil;
import view.ViewBank;

import java.util.ArrayList;

public class Controller {


    private ModelBank model;
    private ViewBank view;

    public Controller(ModelBank model,ViewBank view) {

        this.model = model; this.view = view;
    }
    public void show() {
        model.setBanks(fill());
        int a  = InputUtil.choice(view);
        while(a!=0){
            int c = InputUtil.menu(view);
            if(c==1){
               view.printMessageAndResult(view.OUT_R,model.allDeposites());
                a = InputUtil.choice(view);
            }else if(c==2){
                view.printMessageAndResult(view.OUT_R,model.sortDeposites());
                a = InputUtil.choice(view);
            }
            else if(c==3){
                int early = InputUtil.early(view);
                while(early!=1&&early!=2) early = InputUtil.early(view);
                int add = InputUtil.addMoney(view);
                while(add!=1&&add!=2) add = InputUtil.addMoney(view);

                if(early==1&&add==1)  view.printMessageAndResult(view.OUT_R,model.findDepositsGetMoneyEarlyAndAddMoney());
                else if(early==1)  view.printMessageAndResult(view.OUT_R,model.findDepositsWithGetMoneyEarly());
                else  view.printMessageAndResult(view.OUT_R,model.findDepositsWithAddMoney());

                a = InputUtil.choice(view);
            }else a = InputUtil.choice(view);
        }
        System.exit(1);
    }

    private Bank[] fill (){
        Bank b1 = new Bank("Privat");
        b1.addDeposite("Normal", Bank.DepositeType.ONEYEAR15PERHRIVNA,true, true);
        b1.addDeposite("Super short", Bank.DepositeType.HALFYEAR5PEREURO,false, true);
        b1.addDeposite("Extra long", Bank.DepositeType.TWOYEAR12PERDOLAR,true, false);
        b1.addDeposite("Clasic", Bank.DepositeType.ONEYEAR10PERDOLAR,false, false);

        Bank b2 = new Bank("Ukraine");
        b2.addDeposite("Normal", Bank.DepositeType.ONEYEAR15PERHRIVNA,false, false);
        b2.addDeposite("Normal plus", Bank.DepositeType.ONEYEAR15PERHRIVNA,true, true);

        Bank[] p = {b1,b2 };
        return p;
    }
}
