package utils;

import model.enums.CurrencyEnum;

public class StringUtils {

  public static String getMoneyWithCurrency(double money, CurrencyEnum currencyEnum) {
    return new StringBuffer(String.valueOf(money)).append(" ").append(currencyEnum).toString();
  }
}
