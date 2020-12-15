package poo.intro;

public class Formateur extends Personne implements Employe {
    private int note;
    private int salaire;

    public Formateur(String nom, String prenom, int age, int note) {
        super(nom, prenom, age);
        this.note = note;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String getFullName() {
        return "Pr." + " " + getNom() + " " + getPrenom();
    }

    @Override
    public int getSalaire() {
        return 0;
    }

    @Override
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}