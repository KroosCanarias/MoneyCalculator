package model;

import java.io.IOException;

public class MoneyCalculator { 
    double amount;
    double exchangerate;
    Currency currencyFrom;
    Currency currencyTo;
    public MoneyCalculator(Currency currencyFrom, Currency currencyTo,double amount){
        this.currencyFrom=currencyFrom;
        this.currencyTo=currencyTo;
        this.amount=amount;
    }
    public void process() throws IOException {
        exchangerate = GetExchangeRate.getExchangeRate(currencyFrom,currencyTo);
    }
    public double getMoney() throws IOException{
        process();
        return exchangerate*amount;
    }
}
