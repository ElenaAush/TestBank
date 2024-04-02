package exceptions;

public class ActionsWithClosedBankingProduct extends RuntimeException {

  public ActionsWithClosedBankingProduct(String message) {
    super(message);
  }

  public ActionsWithClosedBankingProduct(String message, Throwable cause) {
    super(message, cause);
  }
}
