package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoVelaTest {

    @Test
    void deveOrcarVela() {
        IServico servico = ServicoFactory.obterServico("Vela");
        assertEquals("Vela orcamento", servico.orcar());
    }

    @Test
    void deveExecutarVela() {
        IServico servico = ServicoFactory.obterServico("Vela");
        assertEquals("Vela trocar", servico.executar());
    }
    @Test
    void devePagarVela() {
        IServico servico = ServicoFactory.obterServico("Vela");
        assertEquals("Vela Pagar", servico.pagar());
    }

}