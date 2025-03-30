import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InventarioPetshop {
    private List<ServicoPetshopIF> servicos;

    public InventarioPetshop() {
        servicos = new ArrayList<>();
    }


    public void adicionaServico(ServicoPetshop servico) {
        servicos.add(servico);
    }

    public int proximoCodigo() {
        return 1 + servicos.size();
    }

    public double calculaValorServico() {
        return servicos.getLast().calculaPreco();
    }

    public String listarServicos() {
        double precoTotal = 0;
        String listar = "";
        for (ServicoPetshopIF servicoPetshop : servicos) {
            listar += servicoPetshop.descricao();
            listar += " R$: ";
            listar += servicoPetshop.calculaPreco();
            precoTotal += servicoPetshop.calculaPreco();
            listar += " \n";
        }
        return listar + "R$: " + precoTotal;
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
