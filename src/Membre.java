public class Membre {
    // Attributs
    private String nom;
    private String prenom;
    private String nTel;
    private Membre parrain; // Attribut pour le membre parrain (si existant)

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getnTel() {
        return nTel;
    }

    public Membre getParrain() {
        return parrain;
    }

    public void setnTel(String nTel) {
        this.nTel = nTel;
    }
    public void setParrain(Membre parrain) {
        this.parrain = parrain;
    }

      // Constructeur initialisant le nom, prénom et numéro de téléphone
            public Membre(String nom, String prenom, String nTel) {
                this.nom = nom;
                this.prenom = prenom;
                this.nTel = nTel;
                this.parrain = null; // Par défaut, aucun parrain
            }



            // Méthode pour initialiser le parrain
            public boolean initialiserParrain(Membre parrain) {
                // Vérifie si le membre a déjà un parrain ou si le parrain est le membre lui-même
                if (this.parrain != null || parrain == this) {
                    return false; // Échec d'initialisation
                }
                this.parrain = parrain; // Initialise le parrain
                return true; // Succès
            }

    // Méthode toString pour renvoyer les informations du membre
    @Override
    public String toString() {
        String infoParrain = (parrain != null) ?
                parrain.getPrenom() + " " + parrain.getNom() : "Pas de parrain";

        return "Nom : " + nom + ", Prénom : " + prenom +
                ", Numéro de téléphone : " + nTel +
                ", Parrain : " + infoParrain;
    }
}
