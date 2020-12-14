package poo.intro;

public class Formateur extends Personne {
    private int note;

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
}
