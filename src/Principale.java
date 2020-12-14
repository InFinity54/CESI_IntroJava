public class Principale {

    public static void main(String[] args) {
        System.out.println("Début programme");

        int age = 15;

        /* Opérateurs possibles */
        // && pour et
        // || pour ou
        // ! pour non

        /* Condition */
        if (age < 12) {
            System.out.println("Vous êtes un enfant.");
        } else if (age < 18) {
            System.out.println("Vous êtes un adolescent.");
        } else {
            System.out.println("Vous êtes un adulte.");
        }

        /* Condition (en une seule ligne) */
        System.out.println(age < 18 ? "Vous êtes majeur." : "Vous êtes mineur.");
    }

}
