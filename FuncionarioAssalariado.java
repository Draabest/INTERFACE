public class FuncionarioAssalariado extends Funcionario implements CalculaBonus {

    public FuncionarioAssalariado(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public double calcularBonus() {
        return 5000.0; // Bônus fixo de R$ 5.000,00
    }
}
