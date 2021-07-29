import java.util.InputMismatchException;
import java.util.Scanner;

public class AppCarro {
    private static final Scanner sc = new Scanner(System.in);
    private static Carro carro;
    private static final String hr = "==============================================";
    private static final String menu = new StringBuilder("\nDigite o número:")
            .append("\n1 para adicionar um passageiro ao carro;")
            .append("\n2 para remover um passageiro do carro;")
            .append("\n3 para listar os detalhes do carro")
            .append("\n0 para encerrar o programa;").toString();

    public static void main(String[] args) {
        System.out.print(new StringBuilder(hr)
                .append("\nVamos Criar Um Carro e Adicionar Pessoas Nele!\n")
                .append(hr)
                .append("\nDigite a capacidade do carro: "));
        carro = new Carro(getInt());

        menu();
    }

    private static void menu() {
        int opcao;
        System.out.println(menu);
        opcao = getInt();
        switch(opcao) {
            case 1:
                adicionarPassageiro();
                break;
            case 2:
                removerPassageiro();
                break;
            case 3:
                imprimirInfo();
                break;
            case 0:
                System.out.println("Programa encerrado!");
                System.exit(0);
            default:
                System.out.println("\n\t! ERRO !\nOpção inválida.");
        }
        menu();
    }

    private static void adicionarPassageiro() {
        if(carro.temEspaco()) {
            Pessoa p = carro.adicionarPassageiro(new Pessoa());
            System.out.printf("*\t%s adicionada com sucesso!%n", p.getNome());
        } else {
            System.out.println("\t! ERRO !\nCarro cheio, remova um passageiro antes de adicionar outro!");
        }
    }

    private static void removerPassageiro() {
        if(!carro.estaVazio()) {
            System.out.printf("*\t%s removido do carro.%n", carro.removerPassageiro());
        } else {
            System.out.println("*\t Nenhum passageiro para remover");
        }
    }

    private static void imprimirInfo() {
        StringBuilder msg = new StringBuilder(hr)
                .append("%nDetalhes sobre o carro:%n\tCapacidade:%n\t\t- %d/%d%n\tPassageiros:");
        String[] nomesPassageiros = carro.getNomesPassageiros();

        if(nomesPassageiros.length > 0) {
            for(String nome : nomesPassageiros) {
                msg.append("%n\t\t- ").append(nome);
            }
        } else {
            msg.append("%n\t\t- Nenhum passageiro.");
        }

        msg.append("%n").append(hr);
        System.out.printf(msg.toString(), carro.getNumeroPassageiros(), carro.getCapacidade());
    }

    private static int getInt() {
        int i;
        try {
            i = sc.nextInt();
            return i;
        } catch(InputMismatchException e) {
            sc.nextLine();
            System.out.print("\n! ERRO !\n Digite um número válido: ");
            return getInt();
        }
    }
}
