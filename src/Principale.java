import java.util.ArrayList;
import poo.intro.Personne;

public class Principale {

    public static void main(String[] args) {
        Personne personne1 = new Personne("DOE", "John", 42);
        Personne personne2 = new Personne("STARK", "Tony", 49);
        Personne personne3 = new Personne("GATES", "Bill", 61);

        ArrayList<Personne> listePersonne = new ArrayList<>();
        listePersonne.add(personne1);
        listePersonne.add(personne2);
        listePersonne.add(personne3);
        listePersonne.remove(1);
        listePersonne.add(2,personne2);

        for (Personne personne : listePersonne) {
            System.out.println(personne.getFullName());
        }

        ArrayList<Integer> listeInt = new ArrayList<>();
        listeInt.add(1);
        listeInt.add(42);
        listeInt.add(58008);
        
        System.out.println(listeInt.get(1));
    }

}
