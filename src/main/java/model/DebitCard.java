package model;

import model.enums.CurrencyEnum;

public class DebitCard extends BankingProduct {

  public DebitCard(CurrencyEnum currencyEnum, String name) {
    super.currencyEnum = currencyEnum;
    super.name = name;
  }

  public DebitCard(String name) {
    super.name = name;
  }
}
