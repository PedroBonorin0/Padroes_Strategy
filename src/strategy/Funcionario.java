package strategy;

public class Funcionario {
  public String acao;

  public String getAcao() {
    return acao;
  }

  public void pagarComPix() {
    Caixa caixa = new Caixa();
    this.acao = caixa.pagar(new PagamentoPix());
  }

  public void pagarComCartao() {
    Caixa caixa = new Caixa();
    this.acao = caixa.pagar(new PagamentoCartao());
  }

  public void pagarComDinheiro() {
    Caixa caixa = new Caixa();
    this.acao = caixa.pagar(new PagamentoDinheiro());
  }
}
