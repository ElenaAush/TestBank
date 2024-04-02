package model;

import static utils.StringUtils.getMoneyWithCurrency;

import model.enums.CurrencyEnum;

public class CreditCard extends BankingProduct {

  private double limitCredit;
  private double interestRate;

  public CreditCard(String name,double limitCredit, CurrencyEnum currencyEnum, double interestRate) {
    super.name = name;
    this.limitCredit = limitCredit;
    super.balance = limitCredit;
    super.currencyEnum = currencyEnum;
    this.interestRate = interestRate;
  }

  public String getDebt() {
    return getMoneyWithCurrency(limitCredit - balance, currencyEnum);
  }
}
