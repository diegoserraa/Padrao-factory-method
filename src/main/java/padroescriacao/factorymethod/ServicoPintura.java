package padroescriacao.factorymethod;

public class ServicoPintura implements IServico {

    public String orcar() { return "Pintura orcamento"; }

    public String executar() {
        return "Pintura trocar";
    }

    public String pagar() {
        return "Pintura Pagar";
    }
}
