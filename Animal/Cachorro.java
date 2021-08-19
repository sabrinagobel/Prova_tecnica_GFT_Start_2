package Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, float peso) {
        super();
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    String som() {
        return "auau";
    }

    @Override
    double quantidadeDeRacao() {
        if (this.peso <= 3)
            this.quantidadeDeRacao = (this.peso * 35);
        else if (peso > 3 && peso <=10)
            quantidadeDeRacao = (peso * 45);
        else
            this.quantidadeDeRacao = (this.peso * 50);
        return quantidadeDeRacao;
    }
}
