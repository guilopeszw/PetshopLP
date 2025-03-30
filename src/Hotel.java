import java.time.LocalDate;
import java.util.Objects;

public class Hotel extends ServicoPetshop {
    private int qtdHoras;
    public Hotel(int codigo, TamAnimal tamanho, int qtdHoras) {
        super(codigo, tamanho);
        this.qtdHoras = qtdHoras;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    @Override
    public double calculaPreco() {
        return getTamanho().getPrecoHotel() * qtdHoras;
    }

    @Override
    public String descricao() {
        return "Hotelzinho";
    }

    @Override
    public String toString() {
        return "Hotel |" +
                "código: " + getCodigo() +
                ", tamanho do animal: " + getTamanho() +
                ", duração da estadia: " + qtdHoras +
                " horas; ";
    }
}
