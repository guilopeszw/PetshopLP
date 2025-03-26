import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InventarioPetshop {
    private List<ServicoPetshopIF> servicos;

    public InventarioPetshop() {
        servicos = new ArrayList<>();
    }


    public List<ServicoPetshopIF> adicionaServico(ServicoPetshopIF servico) {
        servicos.add(servico);
        return servicos;
    }

    public double calculaValorServico() {
        return servicos.getLast().calculaPreco();
    }

    public List<ServicoPetshopIF> listarServicos() {
        List<ServicoPetshopIF> servicos1 = servicos;
        return servicos1;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof InventarioPetshop that)) return false;
        return Objects.equals(servicos, that.servicos);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(servicos);
    }

    @Override
    public String toString() {
        return "Inventário | " +
                "Serviços: " + servicos +
                ". ";
    }
}
