package model;

import exceptions.ActionsWithClosedBankingProduct;
import model.enums.CurrencyEnum;

public class Deposit extends BankingProduct {

  public Deposit(double balance, CurrencyEnum currencyEnum, String name) {
    super.balance = balance;
    super.currencyEnum = currencyEnum;
    super.name = name;
  }

  public boolean isDepositClose() {
    return balance == 0;
  }

  public void closeDeposit() {
    writeOffBalance(balance);
  }

  @Override
  public void replenishBalance(double sum) {
    if (balance == 0) {
      throw new ActionsWithClosedBankingProduct("Deposit is close");
    }
    super.replenishBalance(sum);
  }
}
