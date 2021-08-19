package Idioma;

public class Tcheco extends Idioma {

    final String nomeDoIdioma = "Tcheco";

    @Override
    public String getNomeDoIdioma() {
        return nomeDoIdioma;
    }

    @Override
    public void saudacao() {
        System.out.println(getNomeDoIdioma() + ": Ahoj Svete");
    }
}
