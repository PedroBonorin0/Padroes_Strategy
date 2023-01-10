package strategy;

public class PagamentoCartao implements Pagamento{

  @Override
  public String pagar() {
      return "Oferecer via do cliente";
  }
}
