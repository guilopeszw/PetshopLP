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
}
