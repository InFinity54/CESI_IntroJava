import poo.intro.Employe;
import poo.intro.Formateur;
import poo.intro.ResponsablePedagogique;

public class Principale {
    public static void main(String[] args) {
        Formateur monFormateur = new Formateur("STARK", "Tony", 42, 10);
        ResponsablePedagogique monResponsable = new ResponsablePedagogique("ROGERS", "Steve", 41);

        afficherSalaire(monFormateur);
    }

    public static void afficherSalaire(Employe employe) {
        System.out.println("Cette personne gagne " + employe.getSalaire() + "€ par mois.");
    }
}
