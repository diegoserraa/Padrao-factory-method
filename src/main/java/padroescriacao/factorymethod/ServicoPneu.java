package padroescriacao.factorymethod;

public class ServicoPneu implements IServico {
    public String orcar() { return "Pneu orcamento"; }

    public String executar() {
        return "Pneu trocar";
    }

    public String pagar() {
        return "Pneu Pagar";
    }
}
