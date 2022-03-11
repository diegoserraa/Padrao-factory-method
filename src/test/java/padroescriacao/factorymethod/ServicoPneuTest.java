package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPneuTest {

    @Test
    void deveOrcarPneu() {
        IServico servico = ServicoFactory.obterServico("Pneu");
        assertEquals("Pneu orcamento", servico.orcar());
    }

    @Test
    void deveExecutarPneu() {
        IServico servico = ServicoFactory.obterServico("Pneu");
        assertEquals("Pneu trocar", servico.executar());
    }
    @Test
    void devePagarPneu() {
        IServico servico = ServicoFactory.obterServico("Pneu");
        assertEquals("Pneu Pagar", servico.pagar());
    }

}