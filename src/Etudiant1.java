public class Etudiant1 {
    private String numeroMatricule;
    private String nom;
    private String prenom;
    private Serie1 serie;

    public Etudiant1(String numeroMatricule, String nom, String prenom, Serie1 serie) {
        this.numeroMatricule = numeroMatricule;
        this.nom = nom;
        this.prenom = prenom;
        this.serie = serie;
        // Ajoute cet étudiant à la série
        if (serie != null) {
            serie.ajouterEtudiant(this);
        }
    }

    public String getNumeroMatricule() {
        return numeroMatricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Serie1 getSerie() {
        return serie;
    }

    /**
     * Permet de changer de série.
     * Le changement est autorisé uniquement si la nouvelle série est différente
     * et que l'étudiant n'est pas délégué dans sa série actuelle.
     * En cas de changement, l'étudiant est retiré de l'ancienne série et ajouté à la nouvelle.
     */
    public boolean changerSerie(Serie1 nouvelleSerie) {
        if (this.serie != nouvelleSerie && this.serie.getDelegue() != this) {
            // Retire l'étudiant de la série actuelle
            if (this.serie != null) {
                this.serie.retirerEtudiant(this);
            }
            // Affecte la nouvelle série et l'ajoute à sa liste d'étudiants
            this.serie = nouvelleSerie;
            if (nouvelleSerie != null) {
                nouvelleSerie.ajouterEtudiant(this);
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Etudiant1 { " +
                "nom: " + nom +
                ", prenom: " + prenom +
                ", serie: " + (serie != null ? serie.getNom() : "aucune") +
                ", numeroMatricule: " + numeroMatricule +
                " }";
    }
}
