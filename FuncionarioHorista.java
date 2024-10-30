public class FuncionarioHorista extends Funcionario implements CalculaBonus {

    private double totalAnualRecebido;

    public FuncionarioHorista(String nome, int idade, double totalAnualRecebido) {
        super(nome, idade);
        this.totalAnualRecebido = totalAnualRecebido;
    }

    @Override
    public double calcularBonus() {
        return totalAnualRecebido * 0.10; // Bônus de 10% do total anual
    }
}
