//public class Serie {
//    private char serie;
//    private Etudiant delegue;
//
//    public Serie(char serie) {
//        this.serie = serie;
//        this.delegue = null; // Aucun délégué par défaut
//    }
//
//    public char getSerie() {
//        return serie;
//    }
//
//    public Etudiant getDelegue() {
//        return delegue;
//    }
//
//    public void elireDelegue(Etudiant candidat) {
//        // Vérifie si la série a déjà un délégué
//        if (delegue == null && candidat.getSerie() == this) {
//            this.delegue = candidat;
//            System.out.println("L'étudiant " + candidat.getNom() + " a été élu délégué de la série " + serie + ".");
//        } else if (delegue != null) {
//            System.out.println("Cette série a déjà un délégué.");
//        } else {
//            System.out.println("L'étudiant n'appartient pas à cette série.");
//        }
//    }
//
//    @Override
//    public String toString() {
//        String nomDelegue = (delegue != null) ? delegue.getPrenom() + " " + delegue.getNom() : "Aucun";
//        return "Nom de la série : " + serie + ", Délégué : " + nomDelegue;
//    }
//}
