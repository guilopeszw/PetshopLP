import java.util.Objects;

public class Banho extends ServicoPetshop {
    private TamPelo tamPelo;
    public Banho(int codigo, TamAnimal tamanho, TamPelo tamPelo) {
        super(codigo, tamanho);
        this.tamPelo = tamPelo;
    }

    public TamPelo getTamPelo() {
        return tamPelo;
    }

    @Override
    public double calculaPreco() {
        return getTamanho().getPrecoBanho() + tamPelo.getAdicionalBanho();
    }

    @Override
    public String descricao() {
        return "Banho";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Banho banho)) return false;
        if (!super.equals(o)) return false;
        return tamPelo == banho.tamPelo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamPelo);
    }

    @Override
    public String toString() {
        return "Banho | " +
                "código: " + getCodigo() +
                ", tamanho do animal: " + getTamanho() +
                ", tamanho do pelo: " + tamPelo +
                "; ";
    }
}
