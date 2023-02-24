import java.util.Random;
public class ExemplosDoWhile {
    public static void main(String[] args) {
        
        System.out.println("Discando...");
        do {
            // Executa repetidamente até alguém atender
            System.out.println("Telefone tocando");
        } while (tocando());

        System.out.println("Alô ");

    }

    private static boolean tocando () {
         // Determina se alguém atendeu ou não
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        // Retorna true se ninguém atendeu (ainda tocando)
        return ! atendeu;
    }
}
