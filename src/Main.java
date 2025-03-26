import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<ServicoPetshopIF> servicos = new ArrayList<>();
        int codigoBanho = 1000;
        int codigoTosa = 2000;
        int codigoHotel = 3000;

        System.out.println("Seja bem-vindo(a) ao sistema! ");
        int escolha = getEscolha(sc);

        while (escolha >= 1 && escolha <= 3) {
            switch (escolha) {
                case 1:
                    TamAnimal tamAnimal = getTamAnimal(sc);
                    int codigo = codigoTosa + servicos.size();

                    int antes = servicos.size();
                    Tosa tosa = new Tosa(codigo, tamAnimal);
                    servicos.add(tosa);
                    checaAdd(servicos, antes);
                    break;

                case 2:
                    tamAnimal = getTamAnimal(sc);
                    TamPelo tamPelo = getTamPelo(sc);
                    codigo = codigoBanho + servicos.size();

                    antes = servicos.size();
                    Banho banho = new Banho(codigo, tamAnimal, tamPelo);
                    servicos.add(banho);
                    checaAdd(servicos, antes);
                    break;

                case 3:
                    tamAnimal = getTamAnimal(sc);
                    System.out.println("Informe a duração da hospedagem em horas: ");
                    int qtdHoras = sc.nextInt();
                    codigo = codigoHotel + servicos.size();

                    antes = servicos.size();
                    Hotel hotel = new Hotel(codigo, tamAnimal, qtdHoras);
                    servicos.add(hotel);
                    checaAdd(servicos, antes);
                    break;
            }
            getValor(servicos);
            escolha = getEscolha(sc);
        }
    }

    private static void getValor(List<ServicoPetshopIF> servicos) {
        System.out.println("Valor = R$: " + servicos.getLast().calculaPreco());
    }

    private static TamPelo getTamPelo(Scanner sc) {
        TamPelo tamPelo = null;
        System.out.println("Informe o tamanho da pelagem (CURTO, MÉDIO OU LONGO): ");
        String tamanhoPelo = sc.nextLine();
        if (Objects.equals(tamanhoPelo, "curto") || Objects.equals(tamanhoPelo, "CURTO")) {
            tamPelo = TamPelo.CURTO;
        }
        if (Objects.equals(tamanhoPelo, "médio") || Objects.equals(tamanhoPelo, "medio")
                || Objects.equals(tamanhoPelo, "MEDIO") || Objects.equals(tamanhoPelo, "MÉDIO")) {
            tamPelo = TamPelo.MEDIO;
        }
        if (Objects.equals(tamanhoPelo, "longo") || Objects.equals(tamanhoPelo, "LONGO")) {
            tamPelo = TamPelo.LONGO;
        }
        return tamPelo;
    }

    private static void checaAdd(List<ServicoPetshopIF> servicos, int antes) {
        if (servicos.size() == antes) {
            System.err.println("Houve um erro ao adicionar o serviço. ");
        }
        else {
            System.out.println("Serviço adicionado com sucesso! ");
        }
    }

    private static TamAnimal getTamAnimal(Scanner sc) {
        TamAnimal tamAnimal = null;
        System.out.println("Informe o nome do pet: ");
        sc.nextLine();
        String nomeAnimal = sc.nextLine();
        System.out.println("Informe o tamanho do(a) "  + nomeAnimal + " (PEQUENO, MÉDIO OU GRANDE): ");
        String tamanho = sc.nextLine();
        if (Objects.equals(tamanho, "pequeno") || Objects.equals(tamanho, "PEQUENO")) {
            tamAnimal = TamAnimal.PEQUENO;
        }
        if (Objects.equals(tamanho, "médio") || tamanho == "medio" || Objects.equals(tamanho, "MEDIO") || tamanho == "MÉDIO") {
            tamAnimal = TamAnimal.MEDIO;
        }
        if (Objects.equals(tamanho, "grande") || Objects.equals(tamanho, "GRANDE")) {
            tamAnimal = TamAnimal.GRANDE;
        }
        return tamAnimal;
    }

    private static int getEscolha(Scanner sc) {
        String prompt = """
                Nos informe agendado:\s
                1. Tosa;\s
                2. Banho;\s
                3. Hotel;\s
                INSIRA O QUE DESEJA:\s""";
        System.out.println(prompt);
        return sc.nextInt();
    }
}
