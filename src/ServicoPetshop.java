import java.time.LocalDate;

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
}
