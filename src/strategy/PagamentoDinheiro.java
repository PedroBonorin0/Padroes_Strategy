package strategy;

public class PagamentoDinheiro implements Pagamento{

  @Override
  public String pagar() {
      return "Dar troco, caso necessário";
  }
}
