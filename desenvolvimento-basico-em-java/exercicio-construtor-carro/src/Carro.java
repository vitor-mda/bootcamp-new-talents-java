public class Carro {
    private final String marca, modelo;
    private String variante;
    private final int ano;

    public void setVariante(String variante) {
        this.variante = variante;
    }

    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
}
