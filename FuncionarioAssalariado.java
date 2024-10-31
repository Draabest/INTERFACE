// Classe concreta que representa um funcionário assalariado
// Estende a classe Funcionario e implementa a interface CalculaBonus
public class FuncionarioAssalariado extends Funcionario implements CalculaBonus {

    // Construtor que chama o construtor da superclasse Funcionario
    public FuncionarioAssalariado(String nome, int idade) {
        super(nome, idade);
    }

    // Implementação do método calcularBonus da interface CalculaBonus
    // Para funcionários assalariados, o bônus é fixo em R$ 5.000,00
    @Override
    public double calcularBonus() {
        return 5000.0;
    }
}
