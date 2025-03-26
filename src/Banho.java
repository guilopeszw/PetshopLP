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
}
