// Classe principal que executa o programa
public class Main {
    public static void main(String[] args) {
        // Criação de um funcionário assalariado com nome e idade
        CalculaBonus funcionarioAssalariado = new FuncionarioAssalariado("Ana", 30);
        
        // Criação de um funcionário horista com nome, idade e total anual recebido
        CalculaBonus funcionarioHorista = new FuncionarioHorista("Carlos", 25, 45000.0);

        // Exibe o bônus calculado para o funcionário assalariado
        System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionarioAssalariado.calcularBonus());
        
        // Exibe o bônus calculado para o funcionário horista
        System.out.println("Bônus do Funcionário Horista: R$ " + funcionarioHorista.calcularBonus());
    }
}
