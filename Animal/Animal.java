package Animal;

abstract class Animal {
    String nome;
    float peso;
    float quantidadeDeRacao;

    void Animal(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    abstract String som();

    abstract double quantidadeDeRacao();
}
