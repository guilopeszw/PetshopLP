import java.util.ArrayList;
import java.util.List;

public class InventarioPetshop {

    private List<ServicoPetshopIF> servicos = new ArrayList<>();

    public List<ServicoPetshopIF> adicionaServico(ServicoPetshop servico) {
        servicos.add(servico);
        return servicos;
    }

    public double calculaValorServico(int index) {
        return servicos.get(index).calculaPreco();
    }

    public List<ServicoPetshopIF> listarServicos() {
        return servicos;
    }
}
