import java.util.Objects;

public class Tosa extends ServicoPetshop{
    public Tosa(int codigo, TamAnimal tamanho) {
        super(codigo, tamanho);
    }

    @Override
    public double calculaPreco() {
        return getTamanho().getPrecoTosa();
    }

    @Override
    public String descricao() {
        return "Tosa";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Tosa | " +
                "código: " + getCodigo() +
                ", tamanho do animal: " + getTamanho() +
                ';';
    }
}
