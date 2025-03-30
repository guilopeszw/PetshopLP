import java.time.LocalDate;
import java.util.Objects;

public abstract class ServicoPetshop implements ServicoPetshopIF {
    private LocalDate data = LocalDate.now();
    private int codigo;
    private TamAnimal tamanho;

    public ServicoPetshop(int codigo, TamAnimal tamanho) {
        this.codigo = codigo;
        this.tamanho = tamanho;
    }

    @Override
    abstract public double calculaPreco();

    @Override
    public abstract String descricao();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ServicoPetshop that)) return false;
        return codigo == that.codigo && Objects.equals(data, that.data) && tamanho == that.tamanho;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, codigo, tamanho);
    }

    public TamAnimal getTamanho() {
        return tamanho;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
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
