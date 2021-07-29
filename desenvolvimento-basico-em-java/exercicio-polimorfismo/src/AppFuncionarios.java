public class AppFuncionarios {
    public static void main(String[] args) {
        Funcionario f1 = new Atendente(2500);
        Funcionario f2 = new Supervisor(2500);
        Funcionario f3 = new Gerente(2500);

        System.out.println("Imposto do Atendente:\n\tR$" + f1.getImposto());
        System.out.println("Imposto do Supervisor:\n\tR$" + f2.getImposto());
        System.out.println("Imposto do Gerente:\n\tR$" + f3.getImposto());
    }
}
