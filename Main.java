public class Main {
    public static void main(String[] args) {
        CalculaBonus funcionarioAssalariado = new FuncionarioAssalariado("Ana", 30);
        CalculaBonus funcionarioHorista = new FuncionarioHorista("Carlos", 25, 45000.0); // Exemplo de total anual

        System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionarioAssalariado.calcularBonus());
        System.out.println("Bônus do Funcionário Horista: R$ " + funcionarioHorista.calcularBonus());
    }
}