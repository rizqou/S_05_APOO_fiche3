public class TestPersonne {
    public static void main(String[] args) {
        // Étape 1 : Création de l'adresse
        Adresse adresse = new Adresse("Rue de la gare", "34", "5000", "Namur");

        // Étape 2 : Création des dates de naissance
        Date dateNaissance1 = new Date(6, 2, 1968);
        Date dateNaissance2 = new Date(7, 3, 1979);

        // Étape 3 : Création des personnes
        Personne personne1 = new Personne("Schmidt", "Paul", dateNaissance1, adresse);
        Personne personne2 = new Personne("Gobert", "Valérie", dateNaissance2, adresse);

        // Affichage des informations
        System.out.println(personne1.toString());
        System.out.println("Âge actuel de " + personne1.getPrenom() + " : " + personne1.calculerAge() + " ans");
        System.out.println("Âge de " + personne1.getPrenom() + " en 2000 : " + personne1.calculerAgeEn(2000) + " ans");

        System.out.println(personne2.toString());
        System.out.println("Âge actuel de " + personne2.getPrenom() + " : " + personne2.calculerAge() + " ans");
    }
}
