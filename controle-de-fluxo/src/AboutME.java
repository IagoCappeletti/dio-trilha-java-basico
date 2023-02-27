import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutME {
    public static void main(String[] args) {

        try{ 
            /*
                Try permite que definimos um bloco de código para ser testado 
                quanto a erros enquanto está sendo executado.

                Catch permite definir um bloco de código a ser executado, caso
                ocorra um erro(fluxo não previsto) no bloco try.
             */
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

                System.out.print("Digite seu nome: ");
                String nome = sc.next();

                System.out.print("Digite seu sobrenome: ");
                String sobrenome = sc.next();

                System.out.print("Digite sua idade: ");
                int idade = sc.nextInt();

                System.out.print("Digite sua altura: ");
                double altura = sc.nextDouble();

                System.out.println("\nOla, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
                System.out.println("Tenho " + idade + " Anos ");
                System.out.printf("Minha altura é %.2f cm ", altura);

            sc.close();
        } 
        catch(InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser preenchidos por números");
        }
    }
    
}