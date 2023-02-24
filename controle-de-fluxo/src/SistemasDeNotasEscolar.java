import java.util.Locale;
import java.util.Scanner;

public class SistemasDeNotasEscolar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Digite a nota do auluno: ");
            Double nota = sc.nextDouble();

            if (nota >= 7) {
                System.out.println("Aluno APROVADO !!!");
            } else {
                System.out.println("Aluno REPROVADO !!");
            }

        sc.close();
    }
}
