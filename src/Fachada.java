public class Fachada {
    private InventarioPetshop inventario = new InventarioPetshop();

    public int proximoCodigo() {
        return inventario.proximoCodigo();
    }


    public String listarServicos() {
        return inventario.listarServicos();
    }

    public double calculaValorServico() {
        return inventario.calculaValorServico();
    }

    public void adicionaServico(ServicoPetshop servicoPetshop) {
        inventario.adicionaServico(servicoPetshop);
    }

    public ServicoPetshop criaServicoHotel(int codigo, TamAnimal tamAnimal, int qtdHoras) {
        return new Hotel(codigo, tamAnimal, qtdHoras);
    }

    public  ServicoPetshop criaServicoBanho(int codigo, TamAnimal tamAnimal, TamPelo tamPelo) {
        return new Banho(codigo, tamAnimal, tamPelo);
    }
}
