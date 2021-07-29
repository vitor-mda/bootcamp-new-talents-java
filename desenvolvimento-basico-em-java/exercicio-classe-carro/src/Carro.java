public class Carro {
    private final Pessoa[] passageiros;
    private int numeroPassageiros;
    private final int capacidade;

    public Pessoa adicionarPassageiro(Pessoa novoPassageiro) {
        for(int i = 0; i < capacidade; i++) {
            if(passageiros[i] == null) {
                passageiros[i] = novoPassageiro;
                numeroPassageiros++;
                return novoPassageiro;
            }
        }

        return null;
    }

    public String removerPassageiro() {
        for(int i = 0; i < capacidade; i++) {
            Pessoa p = passageiros[i];

            if(p != null) {
                String nome = p.getNome();
                passageiros[i] = null;
                numeroPassageiros--;
                return nome;
            }
        }

        return null;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public String[] getNomesPassageiros() {
        String[] nomes = new String[numeroPassageiros];

        for(int i = 0, j = 0; i < capacidade; i++) {
            Pessoa p = passageiros[i];
            if(p != null) {
                nomes[j++] = p.getNome();
            }
        }

        return nomes;
    }

    public boolean temEspaco() {
        return numeroPassageiros < capacidade;
    }

    public boolean estaVazio() {
        return numeroPassageiros == 0;
    }

    Carro(final int capacidade) {
        this.capacidade = capacidade;
        this.passageiros = new Pessoa[capacidade];
        numeroPassageiros = 0;
    }
}