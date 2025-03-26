import java.util.Objects;

public class Banho implements ServicoPetshopIF {
    private int codigo;
    private TamAnimal tamAnimal;
    TamPelo tamPelo;

    public Banho(int codigo, TamAnimal tamAnimal, TamPelo tamPelo) {
        this.codigo = codigo;
        this.tamAnimal = tamAnimal;
        this.tamPelo = tamPelo;
    }


    @Override
    public double calculaPreco() {
        return this.tamAnimal.getPrecoBanho() + this.tamPelo.getAdicionalBanho();
    }

    @Override
    public String descricao() {
        return "Banho";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Banho banho)) return false;
        return codigo == banho.codigo && tamAnimal == banho.tamAnimal && tamPelo == banho.tamPelo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tamAnimal, tamPelo);
    }

    @Override
    public String toString() {
        return "Banho | " +
                "código: " + codigo +
                ", tamanho do animal: " + tamAnimal +
                ", tamanho do pelo: " + tamPelo +
                "; ";
    }
}
