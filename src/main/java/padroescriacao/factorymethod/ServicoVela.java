package padroescriacao.factorymethod;

public class ServicoVela implements IServico {
    public String orcar() { return "Vela orcamento"; }

    public String executar() {
        return "Vela trocar";
    }

    public String pagar() {
        return "Vela Pagar";
    }
}
