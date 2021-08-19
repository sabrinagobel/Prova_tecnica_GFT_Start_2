package Idioma;

public class Portugues extends Idioma {
    final String nomeDoIdioma = "Português";

    @Override
    public String getNomeDoIdioma() {
        return nomeDoIdioma;
    }

    @Override
    public void saudacao() {
        System.out.println(getNomeDoIdioma() + ": Olá Mundo");
    }
}

