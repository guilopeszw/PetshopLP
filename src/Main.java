import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fachada fachada = new Fachada();

        System.out.println("Seja bem-vindo(a) ao sistema do Petshop!");
        int escolha = getEscolha(sc);

        while (escolha >= 1 && escolha <= 3) {
            TamAnimal tamAnimal = getTamAnimal(sc);
             int codigo = fachada.proximoCodigo();

            switch (escolha) {
                case 1:

                    fachada.adicionaServico(new Tosa(codigo, tamAnimal));
                    break;

                case 2:
                    TamPelo tamPelo = getTamPelo(sc);
                    fachada.adicionaServico(fachada.criaServicoBanho(codigo, tamAnimal, tamPelo));
                    break;

                case 3:
                    System.out.println("Informe a duração da hospedagem em horas: ");
                    int qtdHoras = sc.nextInt();
                    sc.nextLine();
                    fachada.adicionaServico(fachada.criaServicoHotel(codigo, tamAnimal, qtdHoras));
                    break;

            }
            System.out.println("Valor = R$: " + fachada.calculaValorServico());
            System.out.println(" \n");
            escolha = getEscolha(sc);
        }
        sc.close();
        System.out.println(fachada.listarServicos());
        System.out.println("Sistema fechado com êxito.");
        System.exit(0);
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
        if (Objects.equals(tamanho, "médio") || Objects.equals(tamanho, "medio") || Objects.equals(tamanho, "MEDIO") || Objects.equals(tamanho, "MÉDIO")) {
            tamAnimal = TamAnimal.MEDIO;
        }
        if (Objects.equals(tamanho, "grande") || Objects.equals(tamanho, "GRANDE")) {
            tamAnimal = TamAnimal.GRANDE;
        }
        return tamAnimal;
    }

    private static int getEscolha(Scanner sc) {
        String prompt = """
                Agende:\s
                1. Tosa;\s
                2. Banho;\s
                3. Hotel;\s
                4. Fechar sistema;\s
                INSIRA O QUE DESEJA:\s""";
        System.out.println(prompt);
        return sc.nextInt();
    }
}
