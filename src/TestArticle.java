public class TestArticle {
    public static void main(String[] args) {
        Article article1 = new Article("A001", "Ordinateur", "PC Gamer", 1000.0, 21);
        Article article2 = new Article("A002", "Clavier", "Clavier mécanique", 50.0);

        System.out.println(article1.toString());
        System.out.println("Prix avec TVA : " + article1.calculerPrixAvecTVA() + "€");
        System.out.println("Prix avec TVA et ristourne de 10% : " + article1.calculerPrixAvecTVAEtRistourne(10) + "€");

        System.out.println(article2.toString());
        System.out.println("Prix avec TVA : " + article2.calculerPrixAvecTVA() + "€");
        System.out.println("Prix avec TVA et ristourne de 5% : " + article2.calculerPrixAvecTVAEtRistourne(5) + "€");
    }
}
