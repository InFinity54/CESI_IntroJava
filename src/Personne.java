public class Personne {
    String nom;
    String prenom;
    int age;

    // En Java, on peut déclarer plusieurs fois une même méthode
    // Il n'est pas possible de mettre de valeurs par défaut aux paramètres, d'où cette possibilité
    public String getFullName() {
        return nom + " " + prenom;
    }

    public String getFullName(String civilite) {
        return civilite + " " + getFullName();
    }
}
