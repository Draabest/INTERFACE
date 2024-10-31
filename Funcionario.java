// Classe abstrata que serve como base para diferentes tipos de funcionários
public abstract class Funcionario {
    private String nome; // Nome do funcionário
    private int idade;   // Idade do funcionário

    // Construtor para inicializar o nome e a idade do funcionário
    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para obter o nome do funcionário
    public String getNome() { return nome; }

    // Método para obter a idade do funcionário
    public int getIdade() { return idade; }
}
