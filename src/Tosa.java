import java.util.Objects;

public class Tosa implements ServicoPetshopIF{
    private int codigo;
    private TamAnimal tamAnimal;

    public Tosa(int codigo, TamAnimal tamAnimal) {
        this.codigo = codigo;
        this.tamAnimal = tamAnimal;
    }

    @Override
    public double calculaPreco() {
        return this.tamAnimal.getPrecoTosa();
    }

    @Override
    public String descricao() {
        return "Tosa";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tosa tosa)) return false;
        return codigo == tosa.codigo && tamAnimal == tosa.tamAnimal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tamAnimal);
    }

    @Override
    public String toString() {
        return "Tosa | " +
                "código: " + codigo +
                ", tamanho do animal: " + tamAnimal +
                ';';
    }
}
