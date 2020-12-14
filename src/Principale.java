public class Principale {

    public static void main(String[] args) {
        Personne personne = new Personne();
        Personne personne2 = new Personne();

        personne.setNom("DOE");
        personne.setPrenom("John");
        personne.setAge(42);

        personne2.setNom("STARK");
        personne2.setPrenom("Tony");
        personne2.setAge(39);

        System.out.println(personne);
        System.out.println(personne2);
        System.out.println(personne.getFullName("M."));
        System.out.println(personne2.getFullName("M."));
    }

}
