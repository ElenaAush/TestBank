package service;

import static model.enums.CurrencyEnum.RUB;

import model.DebitCard;
import model.Deposit;
import model.enums.CurrencyEnum;
import org.testng.Assert.ThrowingRunnable;

public class CardsAndDeposit {

  private final String nameBankingProduct = "name1";
  private final double money = 300;
  private final CurrencyEnum currencyEnum = RUB;

  public String topUpDebitCardAndGetBalance(double sum) {
    DebitCard debitCard1 = new DebitCard(nameBankingProduct);
    debitCard1.replenishBalance(sum);
    return debitCard1.getBalance();
  }

  public ThrowingRunnable writeOffMoreBalance(double sum) {
    DebitCard debitCard1 = new DebitCard(nameBankingProduct);
    debitCard1.writeOffBalance(sum);
    return null;
  }

  public boolean isDepositClose() {
    Deposit deposit = new Deposit(money, currencyEnum, nameBankingProduct);
    deposit.closeDeposit();
    return deposit.isDepositClose();
  }
}
