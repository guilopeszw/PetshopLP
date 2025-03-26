import java.util.Objects;

public class Hotel implements ServicoPetshopIF {
    private int codigo;
    private TamAnimal tamAnimal;
    private int qtdHoras;

    public Hotel(int codigo, TamAnimal tamanho, int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    @Override
    public double calculaPreco() {
        return this.tamAnimal.getPrecoHotel() * qtdHoras;
    }

    @Override
    public String descricao() {
        return "Hotelzinho";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Hotel hotel)) return false;
        return qtdHoras == hotel.qtdHoras;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(qtdHoras);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "qtdHoras=" + qtdHoras +
                '}';
    }
}
