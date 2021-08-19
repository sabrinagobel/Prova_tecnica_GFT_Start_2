package Presente;

import java.util.Scanner;

public class Presente {

    public static void main (String[] args) {
        Presente presente = new Presente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o ano de entrada do funcionário: ");
        presente.qualPresente(presente.calculaTempoDeCasa(scanner.nextInt()));
    }

    public int calculaTempoDeCasa(int anoEntrada) {
        return 2021-anoEntrada;
    }

    public void qualPresente(int tempoDeCasa) {
        switch (tempoDeCasa) {
            case 1 -> System.out.println("Vale Presente");
            case 2 -> System.out.println("Smart Watch");
            case 5 -> System.out.println("Fone Bluetooth");
            case 10 -> System.out.println("Vale Jantar");
            case 15 -> System.out.println("Vale Jantar top");
            default -> System.out.println("Esse ano não vai ter presente");
        }
    }
}
