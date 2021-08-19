package Animal;

public class AlimentarOsAnimais {
    public static void main (String[] args) {
        Gato coca = new Gato("Coca", 20);
        Gato foxy = new Gato("Foxy", 3);
        Cachorro einstein = new Cachorro("Einstein", 10);
        Gato edward = new Gato("Edward", 5);

        System.out.println("Coca come " + coca.quantidadeDeRacao() + " gramas");
        System.out.println("Foxy come " + foxy.quantidadeDeRacao() + " gramas");
        System.out.println("Einstein come " + einstein.quantidadeDeRacao() + " gramas");
        System.out.println("Edward come " + edward.quantidadeDeRacao() + " gramas");

        System.out.println("Soma da ração consumida por todos os animais: " +
                (
                        coca.quantidadeDeRacao() +
                        foxy.quantidadeDeRacao() +
                        einstein.quantidadeDeRacao() +
                        edward.quantidadeDeRacao()
                )
        + " gramas");
    }
}
