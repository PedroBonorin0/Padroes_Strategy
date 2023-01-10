package strategy;

public class PagamentoPix implements Pagamento{

  @Override
  public String pagar() {
      return "Verificar Comprovante";
  }
}
