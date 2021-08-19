package Animal;

public class Gato extends Animal {


    public Gato(String nome, float peso) {
        super();
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    String som() {
        return "miau";
    }

    @Override
    double quantidadeDeRacao() {

        if (this.peso <= 4)
            this.quantidadeDeRacao = (this.peso * 12);
        else this.quantidadeDeRacao = (this.peso * 15);
        return quantidadeDeRacao;
    }
}
