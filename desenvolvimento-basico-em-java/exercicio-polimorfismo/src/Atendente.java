public class Atendente extends Funcionario {
    public double getImposto() {
        return salario * 0.0001;
    }

    Atendente(double salario) {
        super(salario);
    }
}
