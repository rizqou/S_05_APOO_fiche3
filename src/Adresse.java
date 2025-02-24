public class Adresse {
    private String rue;
    private String numero;
    private String codePostal;
    private String ville;

    // Constructeur
    public Adresse(String rue, String numero, String codePostal, String ville) {
        this.rue = rue;
        this.numero = numero;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // Getters
    public String getRue() {
        return this.rue;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getCodePostal() {
        return this.codePostal;
    }

    public String getVille() {
        return this.ville;
    }

    // toString
    @Override
    public String toString() {
        return this.rue + " n°" + this.numero + ", " + this.codePostal + " " + this.ville;
    }
}
