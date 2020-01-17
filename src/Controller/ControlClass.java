package Controller;
import java.io.IOException;
import model.*;
import view.GUI;
public class ControlClass {
    
    public static void init() throws IOException{
        try{
            GUI gui=new GUI();
            CurrencyFrom from=new CurrencyFrom();
            CurrencyTo to= new CurrencyTo();
            from.setCurrency(gui.getFrom());
            to.setCurrency(gui.getTo());
            double amount=gui.getAmount();
            execute(from,to,amount,gui);
        }catch(Exception e){
            System.out.println("Pon el numero");
        }
        
    }
    public static void execute(CurrencyFrom from,CurrencyTo to, double amount,GUI gui) throws IOException{
        MoneyCalculator mc=new MoneyCalculator(from,to,amount);
        gui.setRes(String.valueOf(mc.getMoney()));
    }
    public static void main(String [] args) throws IOException{
        init();
    }
}
