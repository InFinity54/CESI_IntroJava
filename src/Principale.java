public class Principale {

    public static void main(String[] args) {
        Personne personne = new Personne();
        Personne personne2 = new Personne();

        personne.nom = "DOE";
        personne.prenom = "John";
        personne.age = 42;

        personne2.nom = "STARK";
        personne2.prenom = "Tony";
        personne2.age = 39;

        System.out.println(personne);
        System.out.println(personne2);
        System.out.println(personne.getFullName("M."));
        System.out.println(personne2.getFullName("M."));
    }

}
