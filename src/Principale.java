import poo.intro.Personne;

public class Principale {

    public static void main(String[] args) {
        Personne personne1 = new Personne("DOE", "John", 42);
        Personne personne2 = new Personne("STARK", "Tony", 49);
        Personne personne3 = new Personne("GATES", "Bill", 61);

        Personne[] mesPersonnes = {personne1, personne2, personne3};

        System.out.println(mesPersonnes[0].getFullName());
        System.out.println(mesPersonnes[1].getFullName());
        System.out.println(mesPersonnes[2].getFullName());
    }

}
