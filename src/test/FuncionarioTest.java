package test;

import org.junit.jupiter.api.Test;
import strategy.Funcionario;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

  @Test
  void devePagarComPix() {
    Funcionario funcionario = new Funcionario();
    funcionario.pagarComPix();
    assertEquals("Verificar Comprovante", funcionario.getAcao());
  }

  @Test
  void devePagarComCartao() {
    Funcionario funcionario = new Funcionario();
    funcionario.pagarComCartao();
    assertEquals("Oferecer via do cliente", funcionario.getAcao());
  }

  @Test
  void devePagarComDinheiro() {
    Funcionario funcionario = new Funcionario();
    funcionario.pagarComDinheiro();
    assertEquals("Dar troco, caso necessário", funcionario.getAcao());
  }
}