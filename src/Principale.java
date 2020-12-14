public class Principale {

    public static void main(String[] args) {
        System.out.println("Début programme");

        /* Types primitifs */
        int monEntier = 42;
        long monGrandEntier = 4200000000L;
        float monDecimal = 42.42f;
        double monGrandDecimal = 42.42;
        boolean monBooleen = true;
        char monCaractere = 'c';

        /* Wrappers (comprenant le type primitif mais allant plus loin) */
        Integer monEntierWrapper = 42;
        Long monGrandEntierWrapper = 4200000000L;
        Float monDecimalWrapper = 42.42f;
        Double monGrandDecimalWrapper = 42.42;
        Boolean monBooleenWrapper = true;
        Character monCaractereWrapper = 'c';
        String monTexteWrapper = "Toto"; // ne possède pas de type primitif

        System.out.println(monEntierWrapper.toString());
        System.out.println(Integer.max(80, 98));
    }

}
