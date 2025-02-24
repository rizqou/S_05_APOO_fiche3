import java.util.ArrayList;

public class Serie1 {
    private char nom;
    private ArrayList<Etudiant1> etudiants;
    private Etudiant1 delegue;

    public Serie1(char nom) {
        this.nom = nom;
        etudiants = new ArrayList<>();
        this.delegue = null;
    }

    public char getNom() {
        return nom;
    }

    public Etudiant1 getDelegue() {
        return delegue;
    }

    /**
     * Ajoute un étudiant à la série s'il n'y est pas déjà.
     */
    public void ajouterEtudiant(Etudiant1 etudiant) {
        if (!etudiants.contains(etudiant)) {
            etudiants.add(etudiant);
        }
    }

    /**
     * Retire un étudiant de la série.
     */
    public boolean retirerEtudiant(Etudiant1 etudiant) {
        return etudiants.remove(etudiant);
    }

    /**
     * Élire un délégué pour la série.
     * Le délégué ne peut être élu que s'il figure dans la liste des étudiants.
     */
    public boolean elireDelegue(Etudiant1 delegue) {
        if (this.delegue == null && etudiants.contains(delegue)) {
            this.delegue = delegue;
            return true;
        }
        return false;
    }

    public int nombreDetudiants() {
        return etudiants.size();
    }

    @Override
    public String toString() {
        // Commencer par la description de la série
        String resultat = "Serie1 { nom = " + nom + ", ";

        // Afficher le délégué ou "aucun" s'il n'y en a pas
        resultat += "delegue = ";
        if (delegue != null) {
            resultat += delegue.getNom();
        } else {
            resultat += "aucun";
        }
        resultat += ", ";

        // Afficher la liste des étudiants
        resultat += "etudiants = [";
        for (int i = 0; i < etudiants.size(); i++) {
            resultat += etudiants.get(i).getNom();

            // Ajouter une virgule de séparation si ce n'est pas le dernier élément
            if (i < etudiants.size() - 1) {
                resultat += ", ";
            }
        }
        resultat += "] }";

        return resultat;
    }



}
