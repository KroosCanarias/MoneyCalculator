package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI extends JFrame{
    private JTextField amount, result;
    private JComboBox comboFrom, comboTo;
    private JLabel money, labelFrom,labelTo,labelRes;
    private Container container;
    private JPanel groupComb,groupAmRes;
    public GUI(){
        container=getContentPane();
        initGroupComb();
        initComboFrom();
        initComboTo();
        groupAmRes();
        initMoney();
        initRes();
        setLocation(100,50);
        setSize(500,200);
        setMinimumSize(new Dimension(100,100));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void initRes(){
        labelRes=new JLabel("Result: ");
        result=new JTextField(3);
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(labelRes);
        panel.add(result);
        groupAmRes.add(panel);
    }
    private void initMoney(){
        amount=new JTextField(3);
        money=new JLabel("Amount: ");
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(money);
        panel.add(amount);
        groupAmRes.add(panel);
    }
    private void groupAmRes(){
        groupAmRes=new JPanel();
        groupAmRes.setLayout(new BoxLayout(groupAmRes,1));
        container.add(groupAmRes,BorderLayout.CENTER);
    }
    private void initGroupComb(){
        groupComb=new JPanel();
        groupComb.setLayout(new BoxLayout(groupComb,1));
        container.add(groupComb,BorderLayout.WEST);
    }
    private void initComboFrom(){
        labelFrom=new JLabel("Choose currency from: ");
        comboFrom=new JComboBox();
        addItemCombo(comboFrom);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(labelFrom);
        panel.add(comboFrom);
        groupComb.add(panel);
    }
    private void initComboTo(){
        labelTo=new JLabel("Choose currency To: ");
        comboTo=new JComboBox();
        addItemCombo(comboTo);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(labelTo);
        panel.add(comboTo);
        groupComb.add(panel);
    }
    private void addItemCombo(JComboBox combo){
        combo.addItem("EUR");
        combo.addItem("USD");
        combo.addItem("GBP");
        combo.addItem("CAD");
    }
    
    public static void main(String [] args){
        new GUI();
    }
}
