package Controller;
import java.io.IOException;
import model.*;
import view.GUI;
public class ControlClass {
    private static GUI gui;
    public static void init() throws IOException{
        gui=new GUI();
    }
    public  void execute() throws IOException{
        CurrencyFrom from=new CurrencyFrom();
        CurrencyTo to= new CurrencyTo();
        double amount=0;
        try{
            from.setCurrency(gui.getFrom());
            to.setCurrency(gui.getTo());
            amount=gui.getAmount();
           
        }catch(NullPointerException e){
            
        }
        
        MoneyCalculator mc=new MoneyCalculator(from,to,amount);
        gui.setRes(String.valueOf(mc.getMoney()));
    }
    public static void main(String [] args) throws IOException{
        init();
    }
}
