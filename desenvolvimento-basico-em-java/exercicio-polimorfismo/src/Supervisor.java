public class Supervisor extends Funcionario {
    public double getImposto() {
        return salario * 0.0005;
    }

    Supervisor(double salario) {
        super(salario);
    }
}
