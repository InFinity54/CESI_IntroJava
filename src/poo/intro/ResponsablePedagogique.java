package poo.intro;

public class ResponsablePedagogique extends Personne implements Employe {
    public ResponsablePedagogique(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public int getSalaire() {
        return 0;
    }

    @Override
    public void setSalaire(int salaire) {

    }
}
