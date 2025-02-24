public class Article {
    private String reference;
    private String nom;
    private String description;
    private double prixHorsTVA;
    private int tauxTVA; // tauxTVA en pourcentage (ex: 21 pour 21%)

    private static final int TAUX_TVA_DEFAUT = 21;

    // Constructeur complet
    public Article(String reference, String nom, String description, double prixHorsTVA, int tauxTVA) {
        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.prixHorsTVA = prixHorsTVA;
        this.tauxTVA = tauxTVA;
    }

    // Constructeur avec taux TVA par défaut
    public Article(String reference, String nom, String description, double prixHorsTVA) {
        this(reference, nom, description, prixHorsTVA, TAUX_TVA_DEFAUT);
    }

    // Getters
    public String getReference() { return reference; }
    public String getNom() { return nom; }
    public String getDescription() { return description; }
    public double getPrixHorsTVA() { return prixHorsTVA; }
    public int getTauxTVA() { return tauxTVA; }

    // Setters
    public void setDescription(String description) { this.description = description; }
    public void setPrixHorsTVA(double prixHorsTVA) { this.prixHorsTVA = prixHorsTVA; }
    public void setTauxTVA(int tauxTVA) { this.tauxTVA = tauxTVA; }

    // Méthode pour calculer le prix TTC
    public double calculerPrixAvecTVA() {
        return prixHorsTVA * (1 + tauxTVA / 100.0);
    }

    // Méthode pour calculer le prix TTC avec ristourne (en pourcentage)
    public double calculerPrixAvecTVAEtRistourne(int ristourne) {
        double prixTTC = calculerPrixAvecTVA();
        return prixTTC * (1 - ristourne / 100.0);
    }

    // Méthode toString
    public String toString() {
        return "Article: " + nom + " (Référence: " + reference + "), Description: " + description +
                ", Prix HT: " + prixHorsTVA + "€, Taux TVA: " + tauxTVA + "%";
    }
}
