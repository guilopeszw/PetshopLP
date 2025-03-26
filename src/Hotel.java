import java.util.Objects;

public class Hotel implements ServicoPetshopIF {
    private int codigo;
    private TamAnimal tamAnimal;
    private int qtdHoras;

    public Hotel(int codigo, TamAnimal tamAnimal, int qtdHoras) {
        this.codigo = codigo;
        this.tamAnimal = tamAnimal;
        this.qtdHoras = qtdHoras;
    }

    @Override
    public double calculaPreco() {
        return this.tamAnimal.getPrecoHotel() * this.qtdHoras;
    }

    @Override
    public String descricao() {
        return "Hotelzinho";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Hotel hotel)) return false;
        return codigo == hotel.codigo && qtdHoras == hotel.qtdHoras && tamAnimal == hotel.tamAnimal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tamAnimal, qtdHoras);
    }

    @Override
    public String toString() {
        return "Hotel |" +
                "código: " + codigo +
                ", tamanho do animal: " + tamAnimal +
                ", duração da estadia: " + qtdHoras +
                " horas; ";
    }
}
