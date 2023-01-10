package strategy;

public class Caixa {
  public Caixa() {}

  public String pagar(Pagamento pagamento) {
    return pagamento.pagar();
  }
}
