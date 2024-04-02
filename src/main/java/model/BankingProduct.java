package model;

import static model.enums.CurrencyEnum.*;
import static utils.StringUtils.getMoneyWithCurrency;

import exceptions.NegativeBalanceException;
import model.enums.CurrencyEnum;

public abstract class BankingProduct {

  protected double balance = 0;
  protected CurrencyEnum currencyEnum = BYN;
  protected String name;

  public String getBalance() {
    return getMoneyWithCurrency(balance, currencyEnum);
  }

  public void replenishBalance(double sum) {
    balance += sum;
  }

  public void writeOffBalance(double sum) {
    if(sum > balance) {
      throw new NegativeBalanceException("The write-off amount exceeds the balance");
    }
    balance -= sum;
  }
}
