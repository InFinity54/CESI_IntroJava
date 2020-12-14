package poo.intro;

public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private boolean majeur;

    // Constructeur par défaut
    public Personne() {}

    // Constructeur avec nom et prénom
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Constructeur avec nom, prénom et âge
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom.substring(0,1).toUpperCase() + prenom.substring(1).toLowerCase();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMajeur() {
        return majeur;
    }

    public void setMajeur(boolean majeur) {
        this.majeur = majeur;
    }

    // En Java, on peut déclarer plusieurs fois une même méthode
    // Il n'est pas possible de mettre de valeurs par défaut aux paramètres, d'où cette possibilité
    public String getFullName() {
        return getNom() + " " + getPrenom();
    }

    public String getFullName(String civilite) {
        return civilite + " " + getFullName();
    }
}
