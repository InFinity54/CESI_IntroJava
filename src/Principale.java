import poo.intro.Formateur;

public class Principale {

    public static void main(String[] args) {
        Formateur monFormateur = new Formateur("DOE", "John", 42, 10);

        System.out.println(monFormateur.getFullName() + " (" + monFormateur.getNote() + ")");
    }

}
