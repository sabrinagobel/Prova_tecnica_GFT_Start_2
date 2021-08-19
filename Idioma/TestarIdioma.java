package Idioma;

public class TestarIdioma {
    public static void main(String[] args) {
        Portugues portugues = new Portugues();
        Ingles ingles = new Ingles();
        Hungaro hungaro = new Hungaro();
        Tcheco tcheco = new Tcheco();

        portugues.saudacao();
        ingles.saudacao();
        hungaro.saudacao();
        tcheco.saudacao();
    }
}
