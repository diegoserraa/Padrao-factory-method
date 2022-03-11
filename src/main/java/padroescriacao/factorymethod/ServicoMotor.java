package padroescriacao.factorymethod;

public class ServicoMotor implements IServico {

    public String orcar() { return "Motor orcamento"; }

    public String executar() {
        return "Motor trocar";
    }

    public String pagar() {
        return "Motor Pagar";
    }
}
