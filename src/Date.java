public class Date {
    private int jour;
    private int mois;
    private int annee;

    // Constructeur
    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    // Getters
    public int getJour() {
        return this.jour;
    }

    public int getMois() {
        return this.mois;
    }

    public int getAnnee() {
        return this.annee;
    }

    // toString
    @Override
    public String toString() {
        return this.jour + "/" + this.mois + "/" + this.annee;
    }
}
