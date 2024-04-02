import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import exceptions.NegativeBalanceException;
import service.CardsAndDeposit;
import org.testng.annotations.Test;

public class Test1 {

  public final double money = 200;

  @Test
  public void checkReplenishment() {
    assertEquals(new CardsAndDeposit().topUpDebitCardAndGetBalance(money), "200.0 BYN");
  }

  @Test
  public void checkForNegativeBalance() {
    assertThrows(NegativeBalanceException.class,
        () -> new CardsAndDeposit().writeOffMoreBalance(money));
  }

  @Test
  public void checkDepositForOpen() {
    assertTrue(new CardsAndDeposit().isDepositClose());
  }
}
