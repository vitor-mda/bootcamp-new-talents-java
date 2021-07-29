public class Gerente extends Funcionario {
    public double getImposto() {
        return salario * 0.001;
    }

    Gerente(double salario) {
        super(salario);
    }
}
