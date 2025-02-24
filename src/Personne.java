import java.time.LocalDate;
import java.time.Period;

public class Personne {
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private Adresse domicile;

    // Constructeur
    public Personne(String nom, String prenom, Date dateDeNaissance, Adresse domicile) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.domicile = domicile;
    }

    // Getters
    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public Date getDateDeNaissance() {
        return this.dateDeNaissance;
    }

    public Adresse getDomicile() {
        return this.domicile;
    }

    // Méthode pour calculer l'âge actuel
    public int calculerAge() {
        LocalDate dateNaissance = LocalDate.of(this.dateDeNaissance.getAnnee(), this.dateDeNaissance.getMois(), this.dateDeNaissance.getJour());
        return Period.between(dateNaissance, LocalDate.now()).getYears();
    }

    // Méthode pour calculer l'âge dans une année donnée
    public int calculerAgeEn(int an) {
        return an - this.dateDeNaissance.getAnnee();
    }

    // toString
    @Override
    public String toString() {
        return this.prenom + " " + this.nom + ", né(e) le " + this.dateDeNaissance.toString() + ", habite à " + this.domicile.toString();
    }
}
