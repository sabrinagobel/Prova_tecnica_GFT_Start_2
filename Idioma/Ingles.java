package Idioma;

public class Ingles extends Idioma {
    final String nomeDoIdioma = "Inglês";

    @Override
    public String getNomeDoIdioma() {
        return nomeDoIdioma;
    }

    @Override
    public void saudacao() {
        System.out.println(getNomeDoIdioma() + ": Hello World");
    }
}
