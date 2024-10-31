// Classe concreta que representa um funcionário horista
// Estende a classe Funcionario e implementa a interface CalculaBonus
public class FuncionarioHorista extends Funcionario implements CalculaBonus {

    private double totalAnualRecebido; // Total anual recebido pelo funcionário horista

    // Construtor que inicializa nome, idade e total anual recebido
    public FuncionarioHorista(String nome, int idade, double totalAnualRecebido) {
        super(nome, idade);
        this.totalAnualRecebido = totalAnualRecebido;
    }

    // Implementação do método calcularBonus da interface CalculaBonus
    // Para funcionários horistas, o bônus é 10% do total anual recebido
    @Override
    public double calcularBonus() {
        return totalAnualRecebido * 0.10;
    }
}
