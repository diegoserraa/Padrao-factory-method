package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPinturaTest {

    @Test
    void deveOrcarPintura() {
        IServico servico = ServicoFactory.obterServico("Pintura");
        assertEquals("Pintura orcamento", servico.orcar());
    }

    @Test
    void deveExecutarPintura() {
        IServico servico = ServicoFactory.obterServico("Pintura");
        assertEquals("Pintura trocar", servico.executar());
    }
    @Test
    void devePagarPintura() {
        IServico servico = ServicoFactory.obterServico("Pintura");
        assertEquals("Pintura Pagar", servico.pagar());
    }
}