public class Principale {

    public static void main(String[] args) {
        System.out.println("Début programme");

        int resultatEntier = 42 * 42;
        float resultatDecimal = 42.42f * 42.42f;
        double resultatGrandDecimal = 42.42 * 42.42;

        // en cas d'opérations avec plusieurs types, le résultat de l'opération correspond au type le plus précis
        // Précision des variables : int > long > float > double
        // ici, comme on un int, un float et un double, le résultat sera un double
        double resultatTypesMultiples = 42 * 42.42f * 42.42;

        System.out.println("resultatEntier: " + resultatEntier);
        System.out.println("resultatDecimal: " + resultatDecimal);
        System.out.println("resultatGrandDecimal: " + resultatGrandDecimal);
        System.out.println("resultatTypesMultiples: " + resultatTypesMultiples);
    }

}
