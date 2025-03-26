import java.time.LocalDate;
import java.util.Objects;

public abstract class ServicoPetshop implements ServicoPetshopIF {
    private LocalDate data;
    private int codigo;
    private TamAnimal tamanho;

    public ServicoPetshop(LocalDate data, TamAnimal tamanho) {
        this.data = data;
        this.tamanho = tamanho;
    }


    @Override
    abstract public double calculaPreco();

    @Override
    public String descricao() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ServicoPetshop that)) return false;
        return codigo == that.codigo && Objects.equals(data, that.data) && tamanho == that.tamanho;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, codigo, tamanho);
    }

    @Override
    public String toString() {
        return "Serviço |" +
                "data: " + data +
                ", código: " + codigo +
                ", tamanho: " + tamanho +
                ';';
    }
}
