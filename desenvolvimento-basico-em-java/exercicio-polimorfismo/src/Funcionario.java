public abstract class Funcionario {
    protected double salario;

    protected double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    protected abstract double getImposto();

    protected Funcionario(double salario) {
        this.salario = salario;
    }
}
